package seleniumfirst;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class submitexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver exe file\\msedgedriver.exe"); 
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		WebElement web0=driver.findElement(By.linkText("Form Submit"));
		web0.click();
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
        WebElement web6=driver.findElement(By.id("validationCustom05"));
        web6.click();
        web6.clear();
        web6.sendKeys("12345");
        web6.sendKeys(Keys.TAB);
       
        WebElement web7=driver.findElement(By.xpath("//label[@class='form-check-label']"));
        
        
        web7.getText();
        WebElement web5=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        web5.click();
        web5.getText();
        WebElement web8=driver.findElement(By.xpath(" //div[contains(text(),'You must agree before submitting.')]"));
        String s=web8.getText();
        System.out.println(s);
      String  expected= "You must agree before submitting.";
        if(s.trim().equals(expected.trim()))
        {
        	System.out.println("error message for not clicking terms and condition");
		}
		else
		{
			System.out.println("failed");
			
		
        }
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver ; 
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(file,new File("C:\\Users\\sinju\\eclipse-workspace\\seleniumfirst\\target\\screenshot.png"));
        
         
        
       


	}

}
