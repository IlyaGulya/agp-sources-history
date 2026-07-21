# AGP sources history

Android Gradle Plugin sources arranged for useful Git history.

Unlike repositories that store every release in a separate directory, this repository keeps the
current release under `sources/`. Every AGP release replaces that tree in its own commit and
is tagged as `agp-<version>`. This makes normal Git history tools useful:

```shell
git log --oneline --all
git diff agp-9.2.1..agp-9.3.0 -- sources/
git checkout agp-9.3.0
```

Generated protobuf sources live in the
[`agp-proto-sources-history`](https://github.com/IlyaGulya/agp-proto-sources-history)
repository. This repository records the matching protobuf commit as the `generated/protos`
submodule, so normal AGP diffs are not overwhelmed by regenerated files. Clone both histories with:

```shell
git clone --recurse-submodules https://github.com/IlyaGulya/agp-sources-history.git
```

Every `agp-<version>` tag exists in both repositories. Checking out a tag here updates the submodule
pointer to exactly the protobuf sources shipped with that AGP release.

## Automation

GitHub Actions checks the official Google Maven metadata daily. The protobuf repository imports
first; this repository then records the matching submodule tags. Both workflows include alpha,
beta, release candidate, and stable builds. They can also be started manually from the Actions tab.

The history starts at AGP `3.0.0-alpha1`, the earliest version of the plugin present in the current
Google Maven metadata.
