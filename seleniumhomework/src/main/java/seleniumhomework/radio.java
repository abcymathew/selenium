package seleniumhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver exe file\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/radio-button-demo.php");
    WebElement male=driver.findElement(By.id("inlineRadio1"));
    
    if(male.isEnabled())//three functions we can use in radio
    {
    male.click();
    }
    if(male.isSelected())
    {
    male.click();
    }
    if(male.isDisplayed())
    {
    male.click();
    }
    WebElement showselectedvalue=driver.findElement(By.cssSelector("button[id=button-one]"));
    showselectedvalue.click();
    WebElement text=driver.findElement(By.id("message-one"));
    String s=text.getText();
    String expected="Radio button 'Male' is checked";
    if(s.trim().equals(expected.trim()))
    {
    	System.out.println("passed");
	}
    else
    {
    	System.out.println("failed");
    }
	
    
    
    
	}

}
