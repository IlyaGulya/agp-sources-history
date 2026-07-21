# AGP sources history

Android Gradle Plugin sources arranged for useful Git history.

Unlike repositories that store every release in a separate directory, this repository keeps the
current release under `sources/`. Every stable AGP release replaces that tree in its own commit and
is tagged as `agp-<version>`. This makes normal Git history tools useful:

```shell
git log --oneline --all
git diff agp-9.2.1..agp-9.3.0 -- sources/
git checkout agp-9.3.0
```

## Automation

GitHub Actions checks the official Google Maven metadata daily. It ignores alpha, beta, and release
candidate builds, downloads the sources for each new stable version, and commits releases in order.
The workflow can also be started manually from the Actions tab.

The initial import starts at AGP 9.1.0. Change the `--baseline` value in the workflow before the
first run if a different starting point is desired.
