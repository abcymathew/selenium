package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class iframeexample {
	@Test()
	public void method1()
	{
		WebDriver driver;
		System.setProperty("webdriver.firefox.driver","C:\\sleleniumdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.pcloudy.com/blogs/handling-iframes-in-selenium-based-test-automation/"); 

		WebElement testFrame = driver.findElement(By.id("hs-form-iframe-0"));
	
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver ;
	
javascriptExecutor.executeScript("arguments[0].scrollIntoView();",testFrame);
		

		
driver.switchTo().frame(testFrame); 
		WebElement email= driver.findElement(By.id("email-fd0dd34f-38ca-4103-88e4-0cd5ff240ad1"));
		 email.click();
	        email.clear();
	       email.sendKeys("Sunidhi.Sinha@iconplc.com");
	        email.sendKeys(Keys.TAB);
	        WebElement name= driver.findElement(By.id("firstname-fd0dd34f-38ca-4103-88e4-0cd5ff240ad1"));
	        name.click();
	        name.clear();
	       name.sendKeys("gokul");
	        name.sendKeys(Keys.TAB);
	        WebElement phone= driver.findElement(By.id("phone-fd0dd34f-38ca-4103-88e4-0cd5ff240ad1"));
	        phone.click();
	        phone.clear();
	       phone.sendKeys("906554444");
	        phone.sendKeys(Keys.TAB);
	        WebElement download= driver.findElement(By.xpath("//input[@value='Download Now!']"));
	        download.click();
		//driver.switchTo().parentFrame(); 
		//driver.switchTo().defaultContent();

		
	}
	
}
