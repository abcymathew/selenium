package seleniumfirst;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowshift {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver exe file\\msedgedriver.exe"); 
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		WebElement webElement = driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		webElement.click();
		String parentWindow = driver.getWindowHandle(); //current window handle 
		Set<String> WindowHandlesss= driver.getWindowHandles() ; //all windows handle 
		for (String childWindow : WindowHandlesss) 
		{ 
			if (!parentWindow.equals(childWindow)) 
			{ 
				driver.switchTo().window(childWindow); 
		          
			//driver.findElement(By.name("emailid")).click();
			//driver.findElement(By.name("emailid")).sendKeys("abcy123");
				
				driver.findElement(By.xpath("//input[@type='text' and @name='email']")).click();
				driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys("abcy@gmail.com");
				
				//driver.findElement(By.xpath("//input[@id=':rq:']")).click();
				//driver.findElement(By.xpath("//input[@id=':rq:']")).sendKeys("abcy123");
				driver.findElement(By.xpath("//span[text()='Password']//following-sibling::input")).click();
				driver.findElement(By.xpath("//span[text()='Password']//following-sibling::input")).sendKeys("abcy123");
				
				//driver.switchTo().window(parentWindow);
				// driver.close();
				TakesScreenshot takesScreenshot = (TakesScreenshot)driver ; 
				File file = takesScreenshot.getScreenshotAs(OutputType.FILE); 
				FileUtils.copyFile(file,new File("C:\\Users\\sinju\\eclipse-workspace\\seleniumfirst\\target\\screenshot.png"));

				 
			}
			

			
	}
		
	}


}


