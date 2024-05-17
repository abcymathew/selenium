package seleniumfirst;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver exe file\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); //impilcit wait
	
		WebElement we = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		
		 we.click();
		 
		 Alert a= driver.switchTo().alert(); 
		 a.accept(); 
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		 WebElement we1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-danger']"))); 
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class='btn btn-danger']"))));//explicit wait 
		we1.click();
		// = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 
		 Alert a1= driver.switchTo().alert(); 
		 a1.sendKeys("saly");
		 a1.getText() ; 
		a1.accept(); 
		we1.sendKeys(Keys.TAB);
		we1.getText();
	}

}
