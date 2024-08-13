ASSESSMENT Of Xische

This project is a cucumber based project. I have used the demo web site https://www.askomdch.com for assessment purpose. I am reading the data from Data Tables and Scenario Outline instead of excel sheet as its a cucumber based project. I have automated multiple scenarios in this framework. The scenarios implemented are adding the product to cart, placing an order using guest login and Checking out. Created the feature files, step definitions classes and test runner classes. I have created the runner class for running it through JUnit and the other runner class for for running it through testing.It supports the runner class for running only failed tests.I have used the dependency injections concept to inject a common object in each class with steps. An object that is recreated every time a new scenario is executed and have created the domain objects to read the from web page.Here page object model is used to segregate the data web elements Ids into separate page classes.It supports running the framework on multiple environments like production,staging,QA,dev.It also supports executing the framework on multiple browsers.I have created a api class to read the endpoint URL.

To Execute the framework through command line use the following command:
mvn clean test
By default the framework would run on staging environment and chrome browser

To Run the framework on Production environment:
mvn clean test -Denv=PROD

This will not run as production URL does not exist.I have given some URL.It will run on staging environment as its the active URL.if you want to run it on other environments you can mention active URL config files.

To run the Framework on other browsers use the following command:
mvn clean test -Denv=STAGE -Dbrowser=edge

mvn clean test -Denv=STAGE -Dbrowser=firefox

To run the framework through the Github actions
Goto Git repo->Click on actions->click JAVA CI with maven

This will automatically trigger the pom.xml and execute the tests.

To Run the framework through docker image

Goto Git repo->Click on actions->click Jekyll site CI

Additionally you can execute the framework by running the individual test runner classes.

For reports I have used cucumber reports.To view reports Target->Cucumber
Target->cucumber-reports







