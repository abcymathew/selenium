package seleniumfirst;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver exe file\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		
		//WebElement webElement = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		//webElement.click();
		//String filePath = "C:\\Users\\sinju\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-03-30 060215.png";
		/*Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		StringSelection stringSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		driver.findElement(By.id("uploadfile_0")).click(); 
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		WebElement fileInput = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		fileInput.sendKeys("C:\\Users\\sinju\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-03-30 060215.png");
		//fileInput.sendKeys(Keys.TAB);
		 driver.findElement(By.id("terms")).click();
		 driver.findElement(By.id("terms")).sendKeys(Keys.TAB);
	driver.findElement(By.id("submitbutton")).click();
		
	WebElement s=driver.findElement(By.xpath("//center[text()='has been successfully uploaded.']"));
	String e=s.getText();
	System.out.println(e);
	}

}
