package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener  
{
	@Override
	 public void onStart(ITestContext context) {
          System.out.println("Test Suit has Started: "+ context.getName());
	 }
	
	@Override
	 public void onFinish(ITestContext context) {
         System.out.println("Test Suit has Finished:  "+ context.getName());
		 
	 }
	
	@Override
	 public void onTestStart(ITestResult result) {
		  System.out.println("Test has Started: "+ result.getName());
		  } 
	
	@Override
	 public void onTestSuccess(ITestResult result) {
		   System.out.println("Test has been passed: "+ result.getName());
		  }
	
	@Override
	public void onTestFailure(ITestResult result) {
           System.out.println("Test has been Failed: "+ result.getName());
	}
}
