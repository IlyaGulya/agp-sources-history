#!/usr/bin/env python3
"""Print stable AGP versions that have not been imported yet."""

from __future__ import annotations

import argparse
import re
import urllib.request
import xml.etree.ElementTree as ET
from pathlib import Path


METADATA_URL = (
    "https://dl.google.com/dl/android/maven2/"
    "com/android/tools/build/gradle/maven-metadata.xml"
)
STABLE_VERSION = re.compile(r"^\d+\.\d+\.\d+$")


def version_key(version: str) -> tuple[int, int, int]:
    parts = tuple(int(part) for part in version.split("."))
    if len(parts) != 3:
        raise ValueError(f"Invalid AGP version: {version}")
    return parts


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--baseline", default="9.1.0")
    parser.add_argument("--state-file", default=".agp-version")
    args = parser.parse_args()

    state_file = Path(args.state_file)
    current = state_file.read_text().strip() if state_file.exists() else None
    lower_bound = version_key(current or args.baseline)

    with urllib.request.urlopen(METADATA_URL, timeout=30) as response:
        root = ET.fromstring(response.read())

    versions = {
        node.text
        for node in root.findall("./versioning/versions/version")
        if node.text and STABLE_VERSION.fullmatch(node.text)
    }
    pending = sorted(
        (
            version
            for version in versions
            if version_key(version) > lower_bound
            or (current is None and version_key(version) == lower_bound)
        ),
        key=version_key,
    )
    print(" ".join(pending))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
