package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inputformdemopage {
	WebDriver driver ;
	
	
	
	
	public inputformdemopage(WebDriver driver )
	{
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id=\\\"collapsibleNavbar\\\"]/ul/li[2]/a")
	WebElement inputform1 ;
	public void inputclick()
	{
		inputform1.click();
	}
	

}
