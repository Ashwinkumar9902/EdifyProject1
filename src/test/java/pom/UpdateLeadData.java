package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpdateLeadData {

    WebDriver driver =new ChromeDriver();
	
	@BeforeClass
	public void setup() {
		//WebDriver driver =new ChromeDriver();
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void UpdateLead() {
		UpdateLead ul = new UpdateLead(driver);
		
		ul.enterEmail("admin@yopmail.com");
		ul.enterPassword("123456");
		ul.clickLogin();
		
		ul.clickLeads();
		ul.clickavi();
	}
}
