package JavaScriptInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DriverClass.DriverClass;

public class ColorChange extends DriverClass {

	WebDriver driver;

	@BeforeClass
	public void fetchDriver() {
		driver = getDriver();
	}

	@Test
	public void f() throws InterruptedException {

		String url = System.getProperty("user.dir") + "\\html\\jsColorChange.html";
		System.out.println(url);
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(".//span"));

		Thread.sleep(3000);

		js.executeScript("arguments[0].style.color = 'Green'", element);
		Thread.sleep(3000);

		js.executeScript("arguments[0].style.fontWeight = 'bold'", element);
		Thread.sleep(3000);

		js.executeScript("arguments[0].style.fontSize = 'xx-large'", element);
		Thread.sleep(3000);

		driver.quit();

	}
}
