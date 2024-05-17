package seleniumfirst;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\sleleniumdriver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		
	
		WebElement we = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		
		 we.click();
		 
		 Alert a= driver.switchTo().alert(); 
		
		 String s= a.getText();	
			System.out.println(s);
		 a.accept(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement we1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 we1.click();
		 
		 Alert a1= driver.switchTo().alert(); 
		 a1.sendKeys("saly");
		 String s1=a1.getText() ; 
		 System.out.println(s1);
		a1.accept(); 
		WebElement we2 = driver.findElement(By.id("prompt-demo"));
	    String s2=we2.getText();
	    System.out.println(s2);
	}

}
