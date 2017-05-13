package MostCommonSeleniumExamples;

import org.testng.annotations.Test;

import DriverClass.DriverClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class DropDownAndAlert extends DriverClass {

	WebDriver driver;

	@BeforeClass
	public void fetchDriver() {
		driver = getDriver();
	}

	@Test
	public void Test() throws InterruptedException {
		String url;
		WebElement dropdown;

		// Get url by concatenating user directory and relative path of the html
		// file
		url = System.getProperty("user.dir") + "\\html\\dropdown.html";
		driver.get(url);

		dropdown = driver.findElement(By.id("cars"));

		Select sel = new Select(dropdown);
		sel.selectByValue("saab");

		Thread.sleep(5000);
		driver.switchTo().alert().accept();

		Thread.sleep(5000);

		driver.quit();

	}

}
