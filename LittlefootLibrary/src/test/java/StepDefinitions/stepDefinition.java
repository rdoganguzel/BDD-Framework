package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjectModel.bookReturnForm;
import pages.utility;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.Select;

@RunWith(Cucumber.class)
public class stepDefinition extends utility {

	static int totalPage = 0;
	int totalPages = utility.total;
	String allDewey = utility.result();

	@Given("^User is on book return page$")
	public void user_is_on_book_return_page() throws Throwable {
		driver = initializeDriver();
		// Run this html in my local computer.
		// In order to run this program you need to save "LibraryForm.html" to your computer and
		// locate the path here
		driver.get("file:///Users/rdoganguzel/Desktop/LittlefootLibrary/LibraryForm.html");

	}

	@When("^User fills the form (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+)$")
	public void user_fills_the_form(String name, String title, String author, String pages, String dewey,
			String readornot, String time, String rating) throws Throwable {
		bookReturnForm bookReturn = new bookReturnForm(driver);

		// Used selenium to find WebElements and send the records to the html page
		bookReturn.getName().sendKeys(name);
		bookReturn.getTitle().sendKeys(title);
		bookReturn.getAuthor().sendKeys(author);
		bookReturn.getPages().sendKeys(pages);
		bookReturn.getDeweyDecimal().sendKeys(dewey);
		// Select from the Read dropdown by value
		Select read = new Select(bookReturn.getReadOrNot());
		read.selectByValue(readornot);
		// Select from the Time dropdown by value
		Select timeDropdown = new Select(bookReturn.getTimeToRead());
		timeDropdown.selectByValue(time);
		// Select from the Ratings dropdown by value
		Select ratingDropdown = new Select(bookReturn.getRating());
		ratingDropdown.selectByValue(rating);

		int pageInt = Integer.parseInt(pages);
		int pageNumber = utility.totalPage(readornot, pageInt);
		utility.dewey(pageInt, dewey, readornot);

	}

	@Then("^Click submit$")
	public void click_submit() throws Throwable {
		bookReturnForm bookReturn = new bookReturnForm(driver);
		// click on submit
		bookReturn.getSubmit().click();
	}

	@And("^Close the browser$")
	public void close_the_browser() throws Throwable {
		// close browser
		driver.quit();
	}

	@Given("^Report the Records to a txt file$")
	public void report_the_records_to_a_txt_file() throws Throwable {

		try {
			//Sends the console output to .txt file
			//choose a path in your computer to save the report.txt
			PrintStream myconsole = new PrintStream(
					new File("//Users/rdoganguzel/Desktop/LittlefootLibrary/report.txt"));
			System.setOut(myconsole);
			myconsole.println("Total Pages Read:" + totalPages);
			myconsole.println("By Category: " + allDewey);
		} catch (FileNotFoundException fx) {
			System.out.println(fx);

		}

	}

}