package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home {
	WebDriver driver ;
	
	By InputForm=By.xpath("//div[@id=\"collapsibleNavbar\"]/ul/li[2]/a");
	By DatePicker=By.xpath("//div[@id=\"collapsibleNavbar\"]/ul/li[3]/a");
	By Table=By.xpath("//div[@id=\"collapsibleNavbar\"]/ul/li[4]/a");
	By progressbar=By.xpath("//div[@id=\"collapsibleNavbar\"]/ul/li[5]/a");
	By Alerts=By.xpath("//div[@id=\"collapsibleNavbar\"]/ul/li[6]/a");
	By Listbox=By.xpath("//div[@id=\"collapsibleNavbar\"]/ul/li[7]/a");
	public home(WebDriver driver )
	{
		this. driver = driver;
	}
	public void click()
	{
		driver.findElement(InputForm).click();
		String s=driver.findElement(InputForm).getText();
		System.out.println(s);

		
		driver.findElement(DatePicker).click();
		String s1=driver.findElement(DatePicker).getText();
		System.out.println(s1);
		
		driver.findElement(Table).click();
	
		String s2=driver.findElement(Table).getText();
		System.out.println(s2);
		driver.findElement(progressbar).click();
		
		String s3=driver.findElement(progressbar).getText();
		System.out.println(s3);
		
		
	}

	
		

	}



