package DriverClass;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class DriverClass {

	WebDriver driver;
	String chromepath;

	@BeforeClass
	public void beforeClass() {
		chromepath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();

	}

	public WebDriver getDriver() {

		return driver;
	}

}
