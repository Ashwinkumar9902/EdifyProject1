package Testng;

import org.testng.annotations.Test;

public class FirstTestCaseTest {
  @Test(priority=0)
   void openapp() 
  {
	 System.out.println("opening application"); 
	  
  }
  
  @Test(priority=1)
  void login() 
 {
	 System.out.println("login to application"); 
	  
 }
  
  @Test(priority=2)
  void logout() 
 {
	 System.out.println("logout from application"); 
	  
 }
}
