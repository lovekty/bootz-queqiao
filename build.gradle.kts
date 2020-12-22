import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    kotlin("jvm") version "1.4.21" apply false
}

group = "cn.bootz.queqiao"
version = "0.0.1"

val javaVersion = "1.8"
val springBootVersion = "2.4.1"
val springCloudVersion = "2020.0.0"

allprojects {
    apply<JavaLibraryPlugin>()

    java.sourceCompatibility = JavaVersion.toVersion(javaVersion)
    java.targetCompatibility = JavaVersion.toVersion(javaVersion)

    dependencies {
        implementation(platform("org.springframework.boot:spring-boot-dependencies:$springBootVersion"))
        implementation(platform("org.springframework.cloud:spring-cloud-dependencies:$springCloudVersion"))
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = javaVersion
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }

}
