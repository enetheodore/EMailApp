import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektCreateBaselineTask
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType

plugins {
    id("io.gitlab.arturbosch.detekt")
}

configure<DetektExtension> {
    config.setFrom(project.rootProject.files("config/detekt/detekt.yml"))
    val name = project.path.replace(":", "-").replace("/", "-")
    baseline = project.rootProject.file("config/detekt/detekt-baseline$name.xml")

    ignoredBuildTypes = listOf("release")
}

tasks.withType<Detekt>().configureEach {
    jvmTarget = ThunderbirdProjectConfig.javaCompatibilityVersion.toString()

    exclude(DEFAULT_EXCLUDES)

    reports {
        html.required.set(true)
        sarif.required.set(true)
        xml.required.set(true)
    }
}

tasks.withType<DetektCreateBaselineTask>().configureEach {
    jvmTarget = ThunderbirdProjectConfig.javaCompatibilityVersion.toString()

    exclude(DEFAULT_EXCLUDES)
}

dependencies {
    detektPlugins(libs.detekt.plugin.compose)
}

val DEFAULT_EXCLUDES = listOf(
    "**/.gradle/**",
    "**/.idea/**",
    "**/build/**",
    ".github/**",
    "gradle/**",
)
