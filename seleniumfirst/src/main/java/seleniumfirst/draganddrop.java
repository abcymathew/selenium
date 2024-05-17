package seleniumfirst;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver exe file\\msedgedriver.exe"); 
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100000));
		WebElement sourceElement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		 WebElement targetElement=driver.findElement(By.id("mydropzone"));
		Actions action = new Actions(driver);
		 action.doubleClick().perform();//double click 
		 action.contextClick(sourceElement).perform(); //right click on an element 
		 action.dragAndDrop(sourceElement,targetElement).perform(); //drag and drop
		// action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform(); //drag and drop
		 WebElement sourceElement2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	
		 if(targetElement.isEnabled()) 
		 {
			 System.out.println("successfull"); 
		 }
		 else
		 {
			 System.out.println("not successfull"); 
		 }
			 List<WebElement> lastelement=driver.findElements(By.id("mylist"));
		 for(WebElement o:lastelement)   
		    {
		    	System.out.println(o.getText());
		    }
		 
		
		

	
	}

}
