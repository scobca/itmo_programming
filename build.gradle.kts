plugins {
    id("java")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    testCompileOnly("org.projectlombok:lombok:1.18.34")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.34")
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    withType<JavaCompile>().configureEach {
        options.encoding = "windows-1251"
    }

    withType<Javadoc>().configureEach {
        options.encoding = "windows-1251"
    }

    withType<Test>().configureEach {
        systemProperty("file.encoding", "windows-1251")
    }
}

application {
    mainClass.set("Main")
}