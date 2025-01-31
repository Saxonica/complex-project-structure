plugins {
    id("java")
}

group = "com.saxonica.bugs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

sourceSets {
    main {
        java {
            srcDir(layout.projectDirectory.dir("../src/main/java"))
        }
    }

    test {
        java {
            srcDir(layout.projectDirectory.dir("../src/test/java"))
        }
    }
}

tasks.test {
    useJUnitPlatform()
}