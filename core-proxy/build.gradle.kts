dependencies {
    api(projects.maintenanceApiProxy)
    api(projects.maintenanceCore)

    // Try to reasonably minimize it...
    implementation(libs.jedis) {
        exclude("com.google.code.gson", "gson")
        exclude("org.slf4j", "slf4j-api")
    }

    // Built-in Discord bot. Audio (opus-java) and voice crypto (tink) are not used and excluded to keep the jar small.
    // slf4j is excluded here: Velocity provides it, while Bungee shades it in separately (see bungee/build.gradle.kts).
    implementation(libs.jda) {
        exclude("club.minnced", "opus-java")
        exclude("com.google.crypto.tink", "tink")
        exclude("org.slf4j", "slf4j-api")
    }

    compileOnly(libs.luckperms)
    compileOnly(libs.guava)
    compileOnly(libs.gson)
}

java {
    withJavadocJar()
}
