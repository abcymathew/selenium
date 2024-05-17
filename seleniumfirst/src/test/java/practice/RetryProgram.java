package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import testsample.Retryanalyzersample;

public class RetryProgram {

	@Test(retryAnalyzer=RetryAnalyserexample.class)
	public void method2()
	{
		WebDriver driver;
		System.setProperty("webdriver.edge.driver","C:\\sleleniumdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php"); 
		WebElement we = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		 we.click();
		 Alert a= driver.switchTo().alert(); 
		 String actual=driver.switchTo().alert().getText();
		 String expected="I am a Javascript";
		 Assert.assertEquals(actual,expected);//since expected and actual value is not matching,retryanalyser checks for 3 times before confirming the error
		 a.accept(); 	
		 		
		 
	}
}
