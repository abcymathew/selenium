package seleniumfirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\sleleniumdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		//finding totla no of rows
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='dtBasicExample']/child::tbody/tr"));
	int rowcount=row.size();
	System.out.println(rowcount);
	//finding total no of columns
	//List<WebElement>column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/thead/tr/th"));
	//System.out.println(column.size());
	//accessing cell value of rows and column
	/*for(WebElement o:row)   
    {
    	System.out.println(o.getText());
    }
	for(WebElement o:column)   
    {
    	System.out.println(o.getText());
    }*/
	//accessing value of 3rd row along
	String v=row.get(2).getText();
	System.out.println(v);
	//accessing individual value of 3rd row and 3rdcolumn
	WebElement b=row.get(2).findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
	String s=b.getText();
	System.out.println(s);
		

	}



	}


