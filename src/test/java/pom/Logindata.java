package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logindata 
{
	WebDriver driver =new ChromeDriver();
	
	@BeforeClass
	public void setup() {
		//WebDriver driver =new ChromeDriver();
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Login() {
		
	
		Login log = new Login(driver);
		log.enterEmail("admin@yopmail.com");
		log.enterPassword("123456");
		log.clickLogin();
	    
		log.clickLeads();
		log.clickCreateLead();
		log.enterName("avi");
		log.enteremail("avinash@gmail.com");
		log.enterPhone("9976123781");
		
		log.clickCreate();
	}

	
}
