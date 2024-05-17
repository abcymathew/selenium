package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class  CrossbrowserTest {
	@Test
	public void chrome()
	{
		WebDriver driver;
		System.setProperty("webdriver.edge.driver","C:\\sleleniumdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		
	}
	
	
	@Test
	public void edge()
	{
		WebDriver driver;
		System.setProperty("webdriver.edge.driver","C:\\sleleniumdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		
	}
	@Test
	public void firefox()
	{
		WebDriver driver;
		System.setProperty("webdriver.firefox.driver","C:\\sleleniumdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		
	}

}
