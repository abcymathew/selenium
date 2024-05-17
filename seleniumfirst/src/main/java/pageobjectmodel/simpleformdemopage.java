package pageobjectmodel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class simpleformdemopage {
	WebDriver driver ;
	By simpleform=By.xpath("//a[text()='Simple Form Demo']");
	By Enter=By.id("single-input-field");
	By Showmessage=By.id("button-one");
	By yourmessage=By.id("message-one");
	By an=By.tagName("a");
	
	public simpleformdemopage(WebDriver driver )
	{
		this. driver = driver;
	}
	public void simpleclick()
	{
		driver.findElement(simpleform).click();
	}
	public String entermessage(String message)
	{
		driver.findElement(Enter).clear();

		driver.findElement(Enter).sendKeys(message);
		return message;
	}
	public void buttonclick()
	{
		driver.findElement(Showmessage).click();
		
		
	}
	public String getenteredtext()
	{
		return driver.findElement(yourmessage).getText();
	
	}
	/*ArrayList<String> a=new ArrayList<String>();
	 public List<WebElement> anchor(){
		 
	 driver.findElement(an).getSize();
	
    
     for(int i=0;i<=(an).;i++)
     {
   	 String value= driver.findElement(an) .getText();
   	 System.out.println(value);
     }

}*/
}
