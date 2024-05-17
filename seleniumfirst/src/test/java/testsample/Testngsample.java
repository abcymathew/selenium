package testsample;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngsample {
	@Test(priority=1)
	
	public void sample()
	{
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver exe file\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
	
		WebElement webElement = driver.findElement(By.xpath("//div[@class='form-group']/child::input[@id='single-input-field']"));
        webElement.click();
        webElement.clear();
        webElement.sendKeys("gokul");
        webElement.sendKeys(Keys.TAB);
        WebElement web=driver.findElement(By.id("button-one"));
        web.click();
        web.getText();
	}
	@Test(priority=-1,invocationCount=2,groups = {"smoke"})
	@Parameters({"browser"})
	public void sample1(String browser)
	{
		System.out.println("first sample");
		System.out.println(browser);
	}
	@Test(priority=0,enabled=false)
	public void sample2()
	{
		System.out.println("second sample");
	}
	@Test(priority=2,groups = {"smoke","regression"})
	public void sample3()
	{
		System.out.println("third sample");
	}
	

}
