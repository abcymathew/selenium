package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\sleleniumdriver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		//driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.get("https://selenium.qabible.in/index.php");
		WebElement table = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[4]/a"));
		table.click();
		Thread.sleep(3000);
		for (int i = 1; i <= 6; i++) {
			WebElement tableheaders = driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr[1]/th[" + i + "]"));
			String headers = tableheaders.getText();
			try {
				if (headers.equals("Name")) {
					System.out.println("Name header is available");
				} else if (!headers.equals("Name")) {

					throw new Exception("Name is not available");
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
			try {
				if (headers.equals("Position")) {
					System.out.println("position header is available");
				} else if (!headers.equals("Position")) {

					throw new Exception("Position is not available");
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
			
			try {
				if (headers.equals("Office")) {
					System.out.println("Office header is available");
				} else if (!headers.equals("Office")) {

					throw new Exception("Office is not available");
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
			
		}
		
		
		int r=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr")).size();
		System.out.println("No Of Rows are :"+r);
		int c=driver.findElements(By.xpath("//table[@id='dtBasicExample']/thead/tr/th")).size();
		System.out.println("No Of Columns are :"+c);
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td["+j+"]")).getText()+"     ");
			}
			System.out.println();
		}

		
		
	}

}
