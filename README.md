## Build and install dep locally

```bash
./gradlew clean build publishToMavenLocal
```


## Build, Publish to Sonatype and Release

```bash
./gradlew clean build publishToMavenCentral closeAndReleaseMavenCentralStagingRepository
```
