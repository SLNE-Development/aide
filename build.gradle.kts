import dev.slne.surf.surfapi.gradle.util.slneReleases

subprojects {
    afterEvaluate {
        configure<PublishingExtension> {
            repositories {
                slneReleases()
            }
        }
    }
}
