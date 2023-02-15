# JUnit5 Gradle Template

> Basic JUnit 5 Gradle template

## Cloning the repository

    git clone https://github.com/kolorobot/junit5-gradle-template.git
    
## Run the tests

    ./gradlew clean test
    
## Run tests with tags included / excluded

    ./gradlew clean test -PtagsInclude=tag1 -PtagsExclude=tag2

## Update project dependencies

- Install latest `gradle` version (`asdf install gradle <VERSION>`)
- Run `./gradlew wrapper --gradle-version=<VERSION>`
- Run `./gradlew clean test` 

## See also

- https://docs.gradle.org/current/userguide/building_java_projects.html
- https://docs.gradle.org/current/userguide/java_testing.html
