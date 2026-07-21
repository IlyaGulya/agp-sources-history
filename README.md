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

## Automation

GitHub Actions checks the official Google Maven metadata daily. It includes alpha, beta, release
candidate, and stable builds, downloads the sources for each new version, and commits them in order.
The workflow can also be started manually from the Actions tab.

The history starts at AGP `3.0.0-alpha1`, the earliest version of the plugin present in the current
Google Maven metadata.
