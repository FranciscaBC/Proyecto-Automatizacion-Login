plugins {
    id("java")
}

group = "cucumber_selenium"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}


dependencies {

    testImplementation ("com.google.inject:guice:5.0.1")

    // Dependencias para JUnit
    testImplementation (platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testImplementation("org.projectlombok:lombok:1.18.26")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.1")

    // Dependencias para Cucumber y Gherkin
    implementation ("io.cucumber:cucumber-java:7.0.0")
    implementation ("io.cucumber:cucumber-junit:7.0.0")
    implementation ("io.cucumber:cucumber-guice:7.0.0")
    implementation ("io.cucumber:cucumber-core:7.0.0")
    implementation ("io.cucumber:cucumber-gherkin:7.0.0")

    //
    implementation ("com.github.javafaker:javafaker:1.0.2")

    //WebDriver
    testImplementation ("io.github.bonigarcia:webdrivermanager:5.0.3")

    implementation ("org.aspectj:aspectjweaver:1.9.7")
    implementation ("org.aspectj:aspectjrt:1.9.7")

    // Dependencias para POM
    implementation ("org.seleniumhq.selenium:selenium-java:3.141.59")
}

tasks.test {
    useJUnitPlatform()
}