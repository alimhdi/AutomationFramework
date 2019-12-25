# AutomationFramework

This is a personal take on the adoption of using selenium with testng in a maven project that is universal enough to support any business. The main focus here is on the foundation and defferent designs in an effort to best accommodate for easy maintenance and flexibility in selecting what test cases/profiles you wish to run.
As an example and for demonstration purposes, I chose to run few test cases on the Linkedin login page. 
The project demonstrates three different design patterns to sucessfully include all necessary elements for a successfull Login UI automation

## Concepts Included

* Parallel test runs
* Page Object pattern
* Common web page interaction methods
* Properties files for data sourcing
* Commonly used test utility classes

## Tools

* Maven
* TestNG
* JUnit
* Selenium Webdriver

## Requirements

In order to utilise this project you need to have the following installed locally:
* Maven 4
* Java 1.8
* Make sure you update FileinputStream path after you download the project - It should be updated in the following class:
   * mainConfiguration.Globaconfiguration.java
   * reusableMethods.Loginmethod2.java
* Make sure to create a new folder under C drive and name it Work(case sensitive)
* Chrome and Chromedriver (UI tests use Chrome by default, can be changed in config) - Chrome driver can be found in BrowserDrivers folder
   * Drop ChromeDriver folder 'C:\\Work\\
* Firefox and geckodriver (UI tests use Chrome by default, can be changed in config) - Firefix driver can be found in BrowserDrivers folderE
   * Drop firefoxDrivver folder 'C:\\Work\\'
* Internet Explorer and IEDriverServer (UI tests use Chrome by default, can be changed in config) - IE driver can be found in BrowserDrivers folder
   * drop IEDriver folder 'C:\\Work\\'

In order for the api tests to make more sense, you will need to configure your username and password. You can edit it in the GlobalInput properties file(you can choose to keep the default value if you wish).

## Available Dependencies
* JUint version 3.8.1
* TestNg version 7.0.0
* Selenium version 3.141.59
* Commons-io version 2.5

## Usage
### How to run your test from eclipse
* Make sure you have TestNG plugin installed. Follow this [link](https://www.guru99.com/install-testng-in-eclipse.html) for instructions on how to intall TestNG
* You can choose to run your test throuhg the TestNG*.xml files or directly at every class level
   * Testng.xml will run one login class(executeLoginTest.LinkedinloginTest.java)  
   * Testng2.xml will run another login class(executeLoginTest.LinkedinabstractlonginTest)   
   * Testng3.xml will run another login class(executeLoginTest.Linkedinlogin2Test)  
   * Testng4.xml will run all available Test classes under Test folder(All the 3 classes menitoned above)  
   
### How to run your test from the comand line
* Maven surefire plugin takes care of running your tests from the cmd. In addition, this project supports profilining which means you can choose to run the profile you desire all based on your testing coverage. e.g. on profiles, you could create a profile for 'smoke testing' another one for 'api testing' and the list goes on.  
For this project, four profiles are available:
   * Run_LinkedinloginTest
   * Run_Linkedinlogin2Test
   * Run_Linkedinabstractionlogintest
   * Run_Alltestcases
To execute any profile, just type `mvn test -P%insert profile name here%`. Make sure you insert the profile name by overwriting the value %insert profile name here%.

## Reporting
TestNG will generate an overall status report at the end of every test run. This report 'index.html' can be found in the project path location inside test-output folder. Make sure to open this file 'index.html' with Web Browser.

In the case of test failures, a screen-shot of the UI at the point of failure is taken and will be dropped in the directory you choose in Listeners.java class. Currently it is defaulted to 'C:\\Work\\' (Don't forget to create this directory on your local machine or have your own and update executeLoginTest.Listeners class)
