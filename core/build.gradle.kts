plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.apache.curator:curator-x-discovery:5.1.0")
    implementation("org.apache.thrift:libthrift:0.13.0")
}
