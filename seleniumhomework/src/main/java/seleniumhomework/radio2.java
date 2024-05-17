package seleniumhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class radio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "C:\\selenium driver exe file\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		

	}

}
