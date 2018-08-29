# Animal Coding Assignment

## Overview
This project is the solution implementation of java coding exercise for Singtel employment hiring process.

## Project Structure
This project is a Maven project. It consists of 2 modules (sub projects), as follows:
* animal-model
* animal-api

## animal-model
animal-model project contains the model objects and implementations for questions A, B, D, E and Bonus-1.
Please note that, there is no question C in the problem statement.

#### Dependencies for animal-model
* JDK 8 (lambda expression and advance stream API are used for solving question E)
* Maven 3
* Libraries specified in pom.xml:
  * JUnit 4
  * cobertura (for coverage test)

#### How to build and run this application
To build this application, please navigate to the root directory of **'animal-model'**, and then run:
```
mvn clean package
```
Upon success build, a file **animal-model-1.0.0-SNAPSHOT.jar** will be produced within the **target** folder.
To run the standalone program for counting the animals (question E), please navigate to **'animal-model/target'** directory, and then run:
```
java -cp animal-model-1.0.0-SNAPSHOT.jar com.singtel.animal.CountingAnimals
```

#### Code Coverage Test
Code coverage test plugin cobertura is configured in Maven configuration file pom.xml.
To generate code coverage test report, please navigate to **'animal-model'** directory of this project and then run:
```
mvn cobertura:cobertura
```
The generated report can then be found in **'animal-model/target/site/cobertura/index.html'** file.

## animal-api
animal-api project contains the implementation for question Bonus-2.

#### Dependencies for animal-api
* JDK 8
* Maven 3
* Spring Boot
* animal-model (above)

#### Spring Boot
This application is a Spring Boot application. It means that the REST API is available online as soon as the application is started up. There is no need for deployment in any container (e.g. Tomcat). Please see Spring Boot documentation for more information.

#### How to build and run this application
Before building **animal-api** application, **animal-model** must first be available in (local) Maven repository.
To make animal-model available in Maven repository (i.e. install), please navigate to **'animal-model'** directory, and then run:
```
mvn clean install
```
Upon successful installation of **animal-model**, we can now build **animal-api** by navigating to **'animal-api'** directory, and then run:
```
mvn clean package
```
To run the application, please navigate to **'animal-api/target'** directory, and then run:
```
java -jar animal-api-1.0.0-SNAPSHOT.jar
```
The REST API application is now online, and the following API are available for access:
* http://localhost:8080/api/animals
* http://localhost:8080/api/countAnimals
* http://localhost:8080/api/animalsThatCanFly
* http://localhost:8080/api/countAnimalsThatCanFly
* http://localhost:8080/api/animalsThatCanSing
* http://localhost:8080/api/countAnimalsThatCanSing
* http://localhost:8080/api/animalsThatCanSwim
* http://localhost:8080/api/countAnimalsThatCanSwim
* http://localhost:8080/api/animalsThatCanWalk
* http://localhost:8080/api/countAnimalsThatCanWalk

**Please see class _com.singtel.animal.web.WebController_ for more information.**

#### Code Coverage Test
Code coverage test plugin cobertura is configured in Maven configuration file pom.xml.
To generate code coverage test report, please navigate to **'animal-api'** directory of this project and then run:
```
mvn cobertura:cobertura
```
The generated report can then be found in **'animal-api/target/site/cobertura/index.html'** file.


