Hello,

I created a Maven Project and all dependencies are under "pom.xml"
Dependencies that I used are:

	-- cucumber-java Version (1.2.5)
	-- cucumber-junit Version (1.2.5)
	-- selenium-java version (3.4.0)
	-- junit version (4.12)
	-- java version (1.7)
	
	** Records are changeable and/or more examples can be added in "libraryReturn.feature" file
	** In order to run Selenium, properties need to change under initializeDriver() method in "utility.java" class
	** You need to save the LibraryForm.html file to your computer and locate the path under 
	user_is_on_book_return_page() method in "stepDefinition.java" class
	** Choose a path in your computer to save "report.txt" under report_the_records_to_a_txt_file() method in
	"stepDefinition.java" class
	** In order to run this test cases, you need to right click on "TestRunner.java" file and Run As "JUnit Test"

==========================================================================================================================================


 1) src/main/java/PageObjectModel/bookReturnForm.java
 	I created "bookReturnForm.java" and defined every single element in the page (LibraryForm.html)
 	by using Page Object Model and Selenium Webdriver
 
 2) src/test/java/features/libraryReturn.feature
 	-- I created feature file as "libraryReturn.feature" 
 	-- I wrote test case scenarios by using Gherkin language in cucumber
 	-- Under "Examples" part I sent the records to html page (LibraryForm.html)
 	-- If you would like to change the records, change it under "Examples"
 	
 3) src/test/java/StepDefinitions/stepDefinition.java
 	
 	-- I implemented test cases in "stepDefinition.java"
 	-- Sending Examples data to html using Selenium
 	-- Reporting to an output file as report.txt
 	
 4) src/test/java/CucumberOptions/TestRunner.java
 
 	--  Required connections for Cucumber 
 	
 5) src/test/java/pages/utility.java
 
 	-- Created methods to implement output logic
