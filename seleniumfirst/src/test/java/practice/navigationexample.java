package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class navigationexample {
	WebDriver driver;
	@Test
	public void openChrome() throws InterruptedException
	{
		
		System.setProperty("webdriver.edge.driver","C:\\selenium driver exe file\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		WebElement inputform=driver.findElement(By.xpath("//a[contains(@href,'simple-form-demo.php')]"));
		inputform.click();
		//navigation commands
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
	
	
		}

}
