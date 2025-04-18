package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener 
{
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@Override
	 public void onStart(ITestContext context) {
		String reportPath = System.getProperty("user.dir") + "/reports/Myreport2.html";
		sparkReporter = new ExtentSparkReporter(reportPath);
		sparkReporter.config().setDocumentTitle("Automation reports");
		sparkReporter.config().setReportName("Login");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
	    extent.setSystemInfo("Computer Name","Localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("OS","Windows 11");
		extent.setSystemInfo("Browser Name","Chrome");
		
		
	  }
	
	  public void onTestSuccess(ITestResult result) {
		    test= extent.createTest(result.getName());
		    test.log(Status.PASS, "Test is  PASSED: "+ result.getName());
		  }
	  
	  public void onTestFailure(ITestResult result) {
		    test = extent.createTest(result.getName());
		    test.log(Status.FAIL, "Test is FAIL:"+ result.getName());
		    test.log(Status.FAIL, "Test is FAILED cause is:"+ result.getThrowable());
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		    test = extent.createTest(result.getName());
		    test.log(Status.SKIP, "Test case is Skipped:"+ result.getName());
		  }
	  
	  public void onFinish(ITestContext context) {
		    extent.flush();
		  }
}
