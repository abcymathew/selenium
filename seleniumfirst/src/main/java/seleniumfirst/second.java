package seleniumfirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver exe file\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
	/*	WebElement webElement = driver.findElement(By.xpath("//div[@class='form-group']/child::input[@id='single-input-field']"));
        webElement.click();
        webElement.clear();
        webElement.sendKeys("gokul");
        webElement.sendKeys(Keys.TAB);
        WebElement web=driver.findElement(By.id("button-one"));
        web.click();
        web.getText();*/
		String expectedValue = "Hello";
	       WebElement Inputform = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
	       Inputform.click();
	      WebElement EnterMessage=driver.findElement(By.id("single-input-field"));
	      EnterMessage.sendKeys(expectedValue);
	      WebElement ShowMessage=driver.findElement(By.id("button-one"));
	      ShowMessage.click();
	      
	      WebElement YourMessage=driver.findElement(By.id("message-one"));
	      String message = YourMessage.getText();
	      
	      System.out.println("Text from application:- "  + message.trim());
	      
	      String output = " Your Message : "+expectedValue ;
	      
	      System.out.println("output:- "  +output.trim());
	      if(message.trim().equals(output.trim())) {
	    	  System.out.println("passed");
	      }else {
	    	  System.out.println("failed");
	    	  
	      }
	      //Addition
	      
	      WebElement EntervalueA=driver.findElement(By.id("value-a"));
	      EntervalueA.sendKeys("5");
	      WebElement EntervalueB =driver.findElement(By.id("value-b"));
	      EntervalueB.sendKeys("3");
	      WebElement GetTotal=driver.findElement(By.id("button-two"));
	      GetTotal.click();
	      WebElement TotalValue=driver.findElement(By.id("message-two"));
	      String message1=TotalValue.getText();
	 System.out.println("total value is:- "  + message1.trim());
	      
	       System.out.println("output1:- "  +message1);
	      if(message1.trim().equals(output)) {
	    	  System.out.println("passed");
	      }else {
	    	  System.out.println("failed");
	    	  
	      }
	      
	      
	     // Thread.sleep(3000);
	      
	      
	      //find Elements
	      
	      List<WebElement> anchor=driver.findElements(By.tagName("a"));
	      System.out.println(anchor.size());
	      for(int i=0;i<=anchor.size();i++)
	      {
	    	 String value= anchor.get(i).getText();
	    	 System.out.println(value);
	      }
	     //  driver.closeBrowser();
			
			
		}

	

        
	}


