package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkbox{

	@Test
	public void edge()
	{
		WebDriver driver;
		System.setProperty("webdriver.edge.driver","C:\\sleleniumdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php"); 
		WebElement SingleCheckboxDemo=driver.findElement(By.xpath("//label[contains(text(),'Click on this check box')]//preceding-sibling::input"));
		 SingleCheckboxDemo.click();
		 String expected="Success - Check box is checked";
		 WebElement text=driver.findElement(By.xpath("//div[contains(text(),'Success - Check box is checked')]"));
		 String textactual=text.getText();
		 Assert.assertEquals(textactual, expected);
		
	}
}
