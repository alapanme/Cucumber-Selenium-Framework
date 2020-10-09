# Cucumber-Selenium-Framework
- A Selenium Web driver Framework using Page Object Model with Cucumber

# Some Generic description about the framework: 
- Chosen maven with cucumber and JUnit. Cucumber allows us to automate test cases in BDD format and with maven maintaining any dependencies is hassle free.
- Created the framework for two browsers for now keeping the option to add as many browsers as we want in the future.
- Also, Implemented two modes of testing Local & Remote. Currently we are using local testing, but in future if we decide to use any tools like Browserstack, it can be easily plugged into our framework.
- All the data, locators are managed from a single location (Configuration.properties) which gives us a very high degree of maintainability and also updation of any data is hassle free; because we update at one place at the changes are reflected everywhere throughout the framework.
- Implemented a Page object model structure for the framework, so that its extensible by just adding any new pages/functionalities that are updated in the Application Under Test.

So, In conclusion; Cucumber understands Gherkin language, read Feature files and execute code written in Step Definition files with the help of Cucumber Options specified in TestRunner.

# Details about the Framework Components (one by one):
- src/main java -> dataProviders -> configFileReader - As the name suggests this is created to read all the data/configurations that are there in the properties file.
- enums -> DriverType - Hardcoding of the driver keywords. Currently it supports chrome & opera. We can add other values in future.
- enums -> EnvironmentType - Hardcoding of the environment type. Currently mentioned are Local & Remote. We can add other values in future.
- managers -> PageObjectmanager - The Page Object Manager is to create the page’s object and also to make sure that the same object should not be created again and again. But to use single object for all the step definition files.
- managers -> WebDriverManager - To make sure that our framework is flexible enough to use as many browsers as possible.
- pageobjects -> FeedbackSelectionPage / GenericFeedbackPage / SpecificFeedbackPage - These are java files containing methods of the user actions happening to that specific page. 
- runners -> Test Runner - Cucumber uses Junit we need to have a Test Runner class. This class will use the Junit annotation @RunWith(), which tells JUnit, what is the test runner class. It more like a starting point for Junit to start for executing the tests.
- stepDefinations -> Steps - An annotation followed by the pattern is used to link the Step Definition to all the matching Steps, and the code is what Cucumber will execute when it sees a Gherkin Step. Cucumber finds the Step Definition file with the help of Glue code in Cucumber Options.
- functionalTests -> FeedbackSubmissionTests.feature - This is where our BDD style Test cases are written in Gherkin language.
- configs -> Configuration.properties - All the data is managed at a single place for the framework.

# How to Run the Tests:
- Through CMD - Go to the Project from command prompt and use the command mvn clean test
- Through Test Runner - `Right click on Test Runner & Run As -> JUnit Tests`

# How to Run in Multiple browsers: 
- So we just have to change the browser and driverpath key from the properties file. I have kept the driver files inside the project so as to prevent any extra setups to run the tests.
