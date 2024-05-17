package testsample;
import org.openqa.selenium.remote.RemoteStatus;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class report {
	
	
	
	
	
	private ExtentReports extentReports;
	public ExtentReports generateReports()
	{ String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html"; 
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportPath);
	htmlReporter.config().setDocumentTitle("Automation Report");
	htmlReporter.config().setReportName("Test Automation Results"); 
	htmlReporter.config().setTheme(Theme.STANDARD);
	extentReports= new ExtentReports(); 
	extentReports.attachReporter(htmlReporter); 
	return extentReports;
	}
	@Test(priority=1)
	public void myTestMethod5()
	{ 
	 extentReports = generateReports() ;
	ExtentTest extenTest =extentReports .createTest("testingA");
	//extenTest.log(RemoteStatus,"entering test"); 
	extenTest.log(Status.PASS,"test passed"); 
	extenTest.log(Status.FAIL,"test passed"); 
	extentReports.flush(); }
	}





