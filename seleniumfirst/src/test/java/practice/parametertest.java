package practice;

import static org.testng.Assert.assertThrows;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertest {
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void openbrowser(String browser) throws Exception 
	{
		if(browser.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver","C:\\sleleniumdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","C:\\sleleniumdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.edge.driver","C:\\sleleniumdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		}
		else
		{
		throw new Exception("incorrect browser");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
	}


}
