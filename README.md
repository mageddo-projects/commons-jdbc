## Build and install dep locally

```bash
./gradlew clean build publishToMavenLocal
```


## Publish to sonatype repo

```bash
./gradlew clean build publish closeAndReleaseRepository
```
