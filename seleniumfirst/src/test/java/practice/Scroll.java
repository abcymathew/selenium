package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll {
	@Test()
	public void method5()
	{
		WebDriver driver;
		System.setProperty("webdriver.firefox.driver","C:\\sleleniumdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.pcloudy.com/blogs/handling-iframes-in-selenium-based-test-automation/"); 

		WebElement testFrame = driver.findElement(By.id("hs-form-iframe-0"));
	
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver ;
	
javascriptExecutor.executeScript("arguments[0].scrollIntoView();",testFrame);
	}
		

}
