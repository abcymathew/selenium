package seleniumfirst;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputform {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver exe file\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //impilcit wait
		 WebElement web=driver.findElement(By.id("validationCustom01"));
        web.click();
        web.clear();
        web.sendKeys("abcy");
        web.sendKeys(Keys.TAB);
        WebElement web1=driver.findElement(By.id("validationCustom02"));
        web1.click();
        web1.clear();
        web1.sendKeys("mathew");
        web1.sendKeys(Keys.TAB);
        WebElement web2=driver.findElement(By.id("validationCustomUsername"));
        web2.click();
        web2.clear();
        web2.sendKeys("abcy1660");
        web2.sendKeys(Keys.TAB);
        
        WebElement web3=driver.findElement(By.id("validationCustom03"));
        web3.click();
        web3.clear();
        web3.sendKeys("anakkara");
        web3.sendKeys(Keys.TAB);
        WebElement web4=driver.findElement(By.id("validationCustom04"));
        web4.click();
        web4.clear();
        web4.sendKeys("kerala");
        web4.sendKeys(Keys.TAB);
        WebElement web5=driver.findElement(By.id("validationCustom05"));
        web5.click();
        web5.clear();
        web5.sendKeys("12345");
        web5.sendKeys(Keys.TAB);
        WebElement web6=driver.findElement(By.xpath("//label[@class='form-check-label']"));
        web6.getText();
        WebElement web7=driver.findElement(By.xpath("//input[@type='checkbox']"));
        web7.click();        
        
        
     
        
        WebElement web8=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        web8.click();
        web8.getText();
        //code for taking screenshot
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver ; 
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE); 
      //  FileUtils.copyFile(file,newFile("C:\\Programming\\Obsqura\\SeleniumTrainingDemo\\target\\MULTIPLE\\screenshot.png"));

        

	}

	


	


}
