package seleniumfirst;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryUIprogress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\sleleniumdriver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		WebElement progressbar = driver.findElement(By.id("progress-bars"));
        progressbar.click();
		WebElement JQueryprogress = driver.findElement(By.xpath("//a[text()='JQuery UI Progress']"));
		 JQueryprogress.click();
		 WebElement download = driver.findElement(By.id("downloadButton"));
		 download.click();
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		 //div[@class='ui-dialog-buttonset']/child::button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close' and @class='ui-button ui-corner-all ui-widget']")));
		// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/child::button")))) ;
		
		 WebElement closebutton=driver.findElement(By.xpath("//button[text()='Close' and @class='ui-button ui-corner-all ui-widget']"));
		closebutton.click();
	
		
		
	
	}

}
