#!/usr/bin/env bash
set -euo pipefail

batch_size=1
exclude_latest=0

while (($#)); do
  case "$1" in
    --batch-size)
      batch_size="$2"
      shift 2
      ;;
    --exclude-latest)
      exclude_latest="$2"
      shift 2
      ;;
    *)
      echo "Unknown argument: $1" >&2
      exit 2
      ;;
  esac
done

versions=($(python3 scripts/find_releases.py))
target_count=$((${#versions[@]} - exclude_latest))
if ((target_count < 0)); then
  target_count=0
fi

git config user.name "AGP Sources Bot"
git config user.email "agp-sources-bot@users.noreply.github.com"

for ((start = 0; start < target_count; start += batch_size)); do
  remaining=$((target_count - start))
  current_size=$batch_size
  if ((remaining < batch_size)); then
    current_size=$remaining
  fi

  batch=("${versions[@]:start:current_size}")
  version_csv="$(IFS=,; echo "${batch[*]}")"
  echo "Preparing ${batch[0]} through ${batch[current_size - 1]}"
  ./gradlew --parallel dumpSources -PagpVersions="$version_csv"

  for version in "${batch[@]}"; do
    mkdir -p sources
    rsync -a --delete "build/agp-sources/$version/" sources/
    find sources -type f -exec chmod 0644 {} +
    printf '%s\n' "$version" > .agp-version

    git add --all sources .agp-version
    git commit --quiet -m "AGP $version"
    git tag -f -a "agp-$version" -m "Android Gradle Plugin $version sources"
    echo "Committed AGP $version"
  done

  git gc
  find build/agp-sources -mindepth 1 -delete
done
