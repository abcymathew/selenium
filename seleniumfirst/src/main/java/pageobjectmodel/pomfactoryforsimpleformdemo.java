package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomfactoryforsimpleformdemo {
	WebDriver driver;

	public pomfactoryforsimpleformdemo(WebDriver driver)
	{
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Simple Form Demo']")
	WebElement simpleform2;
	
	@FindBy(id="single-input-field")
	WebElement Enter1;
	
	@FindBy(id="button-one")
	WebElement showmessage1 ;
	
	@FindBy(id="message-one")
	WebElement yourmessage1  ;
	
	public void simpleclick1()
	{
		simpleform2.click();
	}
	public String entermessage1(String message)
	{
		Enter1.clear();

	Enter1.sendKeys(message);
		return message;
	}
	public void buttonclick1()
	{
		showmessage1.click();
		
		
	}
	public String getenteredtext1()
	{
		return yourmessage1.getText();
	
	}

}
