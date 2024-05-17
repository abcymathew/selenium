package seleniumhomework;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\selenium chromedriver exe file\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement inputform=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']/ul/li[2]/a"));
		inputform.click();
		
		WebElement messagebox =driver.findElement(By.xpath("//input[@placeholder='Message']"));
		messagebox.click();
		messagebox.clear();
		messagebox.sendKeys("abcy");
		 System.out.println(messagebox.getSize());
		org.openqa.selenium.Point s=messagebox.getLocation();
		System.out.println(s);
	Boolean b=	messagebox.equals("abcy");
	System.out.println(b);
	messagebox.sendKeys(Keys.TAB);
	WebElement showmessage=driver.findElement(By.id("single-input-field"));
	showmessage.click();

	
		
		
		
		

	}

}
