plugins {
    `java-library`
}

group = "cn.bootz.queqiao"
version = "0.0.1"

allprojects {
    apply<JavaLibraryPlugin>()

    java.sourceCompatibility = JavaVersion.VERSION_1_8
    java.targetCompatibility = JavaVersion.VERSION_1_8

}

subprojects {
    dependencies {
        implementation(platform("org.springframework.boot:spring-boot-dependencies:2.4.0"))
    }
}