package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bookReturnForm {

	public WebDriver driver;

	//Defined every WebElement in the html page
	By name = By.id("name");
	By townResident = By.name("town_resident");
	By title = By.id("title");
	By author = By.id("author");
	By pages = By.id("pages");
	By deweyDecimal = By.id("dewey_decimal");
	By readOrNot = By.id("readOrNot");
	By timeToRead = By.id("time_to_read");
	By rating = By.id("rating");
	By submit = By.id("submit");
	
	public bookReturnForm(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getTownResident() {
		return driver.findElement(townResident);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getAuthor() {
		return driver.findElement(author);
	}
	public WebElement getPages() {
		return driver.findElement(pages);
	}
	public WebElement getDeweyDecimal() {
		return driver.findElement(deweyDecimal);
	}
	public WebElement getReadOrNot() {
		return driver.findElement(readOrNot);
	}
	public WebElement getTimeToRead() {
		return driver.findElement(timeToRead);
	}
	public WebElement getRating() {
		return driver.findElement(rating);
	}
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
