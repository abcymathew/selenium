package seleniumfirst;

import java.sql.DriverAction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Collections;
import java.util.List;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  DriverAction action;
			  WebDriver driver;
			  System.setProperty("webdriver.chrome.driver", "C:\\sleleniumdriver\\chromedriver.exe"); 
				driver = new ChromeDriver();
				driver.get("https://selenium.qabible.in/select-input.php");
				Select multiselect=new Select(driver.findElement(By.id("multi-select-field")));
			//List<WebElement>e=	multiselect.getAllSelectedOptions();
			//multiselect.selectByValue("Yellow");
		List<WebElement>options=multiselect.getOptions();
		System.out.println(options.size());
		    for(WebElement o:options)   
		    {
		    	System.out.println(o.getText());
		    }
			//multiselect.selectByVisibleText("Red");
			if(multiselect.isMultiple())//multiple options at a time select cheyan pattuo.multiple options at atime select cheyan e method use cheyam.
			{
		
				multiselect.selectByIndex(0);
				multiselect.selectByIndex(1);
				multiselect.selectByIndex(2);
				
			}
			else
			{
				System.out.println("fail");
			}
				WebElement getallselectedbutton=driver.findElement(By.id("button-all"));
				getallselectedbutton.click();
		
				
			
				
				
				
		
			       
			}

}



