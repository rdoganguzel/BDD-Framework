package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility {

	public WebDriver driver;
	public static int total;
	public static String reportDewey = "";
	static int pageNo;
	static int total0, total1, total2, total3, total4, total5, total6, total7, total8, total9;
	static String reportDewey0 = "", reportDewey1 = "", reportDewey2 = "", reportDewey3 = "", reportDewey4 = "",
			reportDewey5 = "", reportDewey6 = "", reportDewey7 = "", reportDewey8 = "", reportDewey9 = "";

	public WebDriver initializeDriver() throws IOException {

		// execute Chrome Driver
		//you need to locate your chrome driver here
		System.setProperty("webdriver.chrome.driver", "/Users/rdoganguzel/Documents/chromedriver");
		driver = new ChromeDriver();
		return driver;
	}

	public static int totalPage(String readornot, int pageInt) {
		
		// gets total pages read
		if (readornot.equals("read")) {
			total = total + pageInt;
		} else if (readornot.equals("partially")) {
			total = total + pageInt / 2;
		} else {
			total = total + 0;
		}
		return total;
	}

	public static int pageCalculation(String readornot, int pageInt) {
		if (readornot.equals("read")) {
			pageNo = pageInt;
		} else if (readornot.equals("partially")) {
			pageNo = pageInt / 2;
		} else {
			pageNo = 0;
		}
		return pageNo;
	}

	public static void dewey(int page, String dewey, String readornot) {
		
		//based on your first number of Dewey Decimal, categorize your input 
		String a = dewey.substring(0, 1);
		reportDewey = "";
		switch (a) {
		case "0":
			total0 = total0 + pageCalculation(readornot, page);
			if (total0 > 0)
				reportDewey0 = "\n" + "Computer Science, Information & General Works: " + total0;
			break;
		case "1":
			total1 = total1 + pageCalculation(readornot, page);
			if (total1 > 0)
				reportDewey1 = "\n" + "Philosophy & Psychology: " + total1;
			break;
		case "2":
			total2 = total2 + pageCalculation(readornot, page);
			if (total2 > 0)
				reportDewey2 = "\n" + "Religion: " + total2;
			break;
		case "3":
			total3 = total3 + pageCalculation(readornot, page);
			if (total3 > 0)
				reportDewey3 = "\n" + "Social Sciences: " + total3;
			break;
		case "4":
			total4 = total4 + pageCalculation(readornot, page);
			if (total4 > 0)
				reportDewey4 = "\n" + "Language: " + total4;
			break;
		case "5":
			total5 = total5 + pageCalculation(readornot, page);
			if (total5 > 0)
				reportDewey5 = "\n" + "Pure Science: " + total5;
			break;
		case "6":
			total6 = total6 + pageCalculation(readornot, page);
			if (total6 > 0)
				reportDewey6 = "\n" + "Applied Science: " + total6;
			break;
		case "7":
			total7 = total7 + pageCalculation(readornot, page);
			if (total7 > 0)
				reportDewey7 = "\n" + "Arts & Recreation: " + total7;
			break;
		case "8":
			total8 = total8 + pageCalculation(readornot, page);
			if (total8 > 0)
				reportDewey8 = "\n" + "Literature: " + total8;
			break;
		case "9":
			total9 = total9 + pageCalculation(readornot, page);
			if (total9 > 0)
				reportDewey9 = "\n" + "History & Geography: " + total9;
			break;
		}

	}

	public static String result() {
		return reportDewey1 + reportDewey2 + reportDewey3 + reportDewey4 + reportDewey5 + 
				reportDewey6 + reportDewey7 + reportDewey8 + reportDewey9;
	}

}
