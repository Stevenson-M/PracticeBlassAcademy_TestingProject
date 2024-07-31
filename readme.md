# PracticeBlassAcademy Testing Project

## Overview
This project is focused on automating tests for various web pages using Selenium WebDriver with Java. The design follows the Page Object Model (POM) pattern and uses Maven for build automation. The tests are written using TestNG.

## Prerequisites
- Java Development Kit (JDK) 11 or higher
- Maven (version 3.6.3 or higher)

## Setup
1. Clone the repository:
    ```sh
    git clone "https://github.com/YourUsername/PracticeBlassAcademy.git"
    cd PracticeBlassAcademy
    ```

2. Install the dependencies:
    ```sh
    mvn clean install
    ```

## Project Structure
```plaintext
PracticeBlassAcademy/
├── .idea/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/
│   │   │       └── configuration/
│   │   │           ├── WebDriverProvider.java
│   │   │           └── WebOperations.java
│   │   └── resources/
│   │       └── log4j2.xml
│   └── test/
│       ├── java/
│       │   ├── pages/
│       │   │   ├── BasePage.java
│       │   │   ├── LoginPage.java
│       │   │   └── ShoppingPage.java
│       │   ├── tests/
│       │   │   ├── BasicTests.java
│       │   │   ├── VerifySauceDemoLoginErrorMessageTest.java
│       │   │   ├── VerifySauceDemoPageTest.java
│       │   │   └── VerifySauceDemoShoppingPageTest.java
│       │   └── utilities/
│       │       ├── BaseTest.java
│       │       ├── Listener.java
│       │       └── Logs.java
│       └── resources/
│           ├── logs/
│           └── suite.xml
├── target/
├── .gitignore
├── pom.xml
└── README.md
```
Usage

## Running Tests
To run the tests using Maven:
```sh
mvn test
```

## Logging
The project uses Log4j2 for logging. You can configure the logging settings in the log4j2.xml file located in the src/main/resources directory.

## Author
Jinson Stevenson Moreno Aguilar - jinson.moreno@gmail.com