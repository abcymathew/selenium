package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DynamicTable {
	@Test
	public void tableMethod()
	{
	WebDriver driver;
	String name,age,salary;
	System.setProperty("webdriver.chrome.driver", "C:\\sleleniumdriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/table-pagination.php");
	
	List<WebElement> row=driver.findElements(By.xpath("//table[@id='dtBasicExample']/child::tbody/tr"));

	int rowcount=row.size();
	System.out.println(rowcount);
	for(int i=1;i<=rowcount;i++)
	{
		
			name=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td[1]")).getText();
			//System.out.println(name);
			if(name.equalsIgnoreCase("Ashton Cox"))
			{
				age=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td[4]")).getText();
				System.out.println(age);
				Assert.assertEquals("66",age);//hard assert
				salary=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td[6]")).getText();
				System.out.println(salary);
				SoftAssert soft=new SoftAssert();
				soft.assertEquals("86,001",salary);//here expected and actual value is different
				soft.assertAll();//to show soft assertion as failure while running//check with assertall once and without assertall once and see the difference while running
			}
		

	}

}
}
