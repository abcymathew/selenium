package testsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.home;
import pageobjectmodel.inputformdemopage;
import pageobjectmodel.pomfactoryforsimpleformdemo;
import pageobjectmodel.simpleformdemopage;



public class pageobjectmodelclass {
	WebDriver driver ;
	String url="https://selenium.qabible.in/index.php";
	home first;
	inputformdemopage second;
	simpleformdemopage third;
	pomfactoryforsimpleformdemo fourth;
	@BeforeTest
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver exe file\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(url);
	}
	@Test(priority=1)
	public void verify()
	{
		//first=new home(driver);
		//first.click();
		second=new inputformdemopage(driver);
		second.inputclick();
		
		third=new simpleformdemopage(driver);
		third.simpleclick();
		third.entermessage("abcy");
		third.buttonclick();
		Assert.assertEquals(third.getenteredtext(),"Your Message : abcy");
		
		
		
		
	}
	@Test(priority=2)
	public void verifyfactory()
	{
		fourth=new pomfactoryforsimpleformdemo(driver);
		fourth.simpleclick1();
		fourth.entermessage1("abin");
		fourth.buttonclick1();
		String text=fourth.getenteredtext1();
		String expected="Your Message : abin";
		Assert.assertEquals(text,expected);
		
	
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	

}
