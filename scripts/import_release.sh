#!/usr/bin/env bash
set -euo pipefail

if [[ $# -ne 2 ]]; then
  echo "usage: $0 <agp-version> <extracted-sources-directory>" >&2
  exit 2
fi

version="$1"
extracted="$2"
proto_repo="generated/protos"

if [[ ! "$version" =~ ^[0-9]+\.[0-9]+\.[0-9]+(-(alpha|beta|rc)[0-9]+)?$ ]]; then
  echo "invalid AGP version: $version" >&2
  exit 2
fi
if [[ ! -d "$extracted" ]]; then
  echo "sources directory does not exist: $extracted" >&2
  exit 2
fi
if [[ ! -d "$proto_repo/.git" && ! -f "$proto_repo/.git" ]]; then
  echo "protobuf submodule is not initialized: $proto_repo" >&2
  exit 2
fi

mkdir -p sources
rsync -a --delete "$extracted/" sources/

proto_modules=(
  "com.android.tools.analytics-library/protos"
  "com.android.tools.build/aapt2-proto"
)

if ! git -C "$proto_repo" rev-parse --verify --quiet "refs/tags/agp-$version^{}" >/dev/null; then
  echo "protobuf tag agp-$version is not published yet; rerun after the protobuf workflow" >&2
  exit 1
fi
git -C "$proto_repo" checkout --quiet "agp-$version^{}"

for module in "${proto_modules[@]}"; do
  source_dir="sources/$module"
  if [[ -e "$source_dir" ]]; then
    find "$source_dir" -depth -delete
  fi
done
find sources -type f -exec chmod 0644 {} +
printf '%s\n' "$version" > .agp-version

git add --all -- sources .agp-version "$proto_repo"
git commit --quiet -m "AGP $version"
git tag -a "agp-$version" -m "Android Gradle Plugin $version sources"
