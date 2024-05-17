package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ajaxformsubmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver exe file\\msedgedriver.exe"); 
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/ajax-form-submit.php");
		 WebElement subject=driver.findElement(By.id("subject"));
		 subject.click();
		 subject.clear();
	        subject.sendKeys("100");
	        String expected="automation subject";
	        
	       String s= subject.getAttribute("type");
	       System.out.println(s);
	       String s2= subject.getText();
	       System.out.println(s2);
	       String s1=subject.getTagName(); 
	       System.out.println(s1);
	       if(s2.trim().equals(expected))
	       {
	    	   System.out.println("ajax form submission accepts string values");
	       }
	       else {
	    	   System.out.println("failed");
	       }
	       
	        subject.sendKeys(Keys.TAB);
	        
	        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver ;
	        String value = "helo im abcy mathew.im coming from anakkaraimmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
	        javascriptExecutor.executeScript("document.getElementById('description').value='"+value+"'"); 
	        
	        WebElement ajaxclick=driver.findElement(By.xpath("//input[@value='Submit']"));
			 ajaxclick.click();

	}

}
