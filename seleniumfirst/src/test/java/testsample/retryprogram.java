package testsample;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class retryprogram {
	@Test(priority = 0, retryAnalyzer= Retryanalyzersample.class) 
	 public void testingA() 
	 { // TODO Auto-generated method stub 
		 WebDriver driver; 
			System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver exe file\\chromedriver.exe"); 
			driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://en.wikipedia.org/");
	 String pageTitle=driver.getTitle(); 
	 System.out.println(pageTitle);
	 Assert.assertEquals(pageTitle, "Wikipedia, the free encyclopediaa");
	 //AssertJUnit.assertEquals(pageTitle, "Wikipedia, the free encyclopediaa");
	 System.out.println("Hard Assert: Executions stops when a Hard Assert Fails. Page title is compared & it is correct");
	// SoftAssert softAssert = new SoftAssert();
	// softAssert.assertEquals(pageTitle, "Wikipedia, the free encyclopediaa");
	 //System.out.println("Soft Assert: Executions continues even when a Soft Assert Fails. Page title is compared & it is wrong");
	 }


}
