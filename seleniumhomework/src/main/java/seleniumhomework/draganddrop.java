package seleniumhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver exe file\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://selenium.qabible.in/drag-drop.php");
        WebElement drag=driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]"));
        drag.click();
      WebElement source=driver.findElement(By.xpath("//span[contains(text(),'Draggable n°1')]"));
      WebElement target=driver.findElement(By.id("mydropzone"));
      Actions action=new Actions(driver);
      action.contextClick(source).perform();
      action.dragAndDrop(source, target).perform();
     
    
        
	}

}
