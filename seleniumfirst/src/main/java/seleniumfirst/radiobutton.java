package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\sleleniumdriver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		 WebElement inputform=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']/ul/li[2]/a"));
		 inputform.click();
		 WebElement radioformdemo=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		
		 radioformdemo.click();
		 WebElement radiobuttonmale=driver.findElement(By.id("inlineRadio1"));
		 radiobuttonmale.click();
		 WebElement showselectedvalue=driver.findElement(By.id("button-one"));
		 showselectedvalue.click();
		 WebElement message=driver.findElement(By.id("message-one")); 
		String s= message.getText();
		System.out.println(s.trim());
		String Expected="Radio button 'Male' is checked";
		if(s.trim().equals(Expected.trim()))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
			
		}
	}

}
