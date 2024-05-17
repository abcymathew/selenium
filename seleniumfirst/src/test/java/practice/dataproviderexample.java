package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderexample {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		
		System.setProperty("webdriver.edge.driver","C:\\sleleniumdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		
	}

@Test(dataProvider = "input field")
public void values(String valueA,String valueB)
{ 
	 System.out.println("Key=" + valueA +" , "+ "value="+valueB );
	 WebElement EntervalueA=driver.findElement(By.id("value-a"));
     EntervalueA.sendKeys(valueA);
     
     WebElement EntervalueB =driver.findElement(By.id("value-b"));
     EntervalueB.sendKeys(valueB);
     WebElement GetTotal=driver.findElement(By.id("button-two"));
     GetTotal.click();
     
    
     WebElement TotalValue=driver.findElement(By.id("message-two"));
     String message1=TotalValue.getText();
     EntervalueA.clear();
     EntervalueB.clear();
    
String actual= message1.trim();
String expected= message1.trim();
     
   Assert.assertEquals(actual,expected);
    
	
	 
	
	 } 
@DataProvider(name="input field")
public Object[][] value1Value2Pair()
{
	 return new Object[][] 
			 { 
		 {"5","7"}, {"6","8"}} ;
		 }
}
