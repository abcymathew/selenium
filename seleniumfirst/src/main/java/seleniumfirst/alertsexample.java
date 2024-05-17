package seleniumfirst;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alertsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\sleleniumdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement e=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Actions action=new Actions(driver);
		action.doubleClick(e).perform();//inroder to double click we need action class.
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	
		
		

	}

}
