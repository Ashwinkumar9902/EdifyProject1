package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRMLoginTestng 
{
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		
	}
	
	@Test(priority=0)
	void openURL() {
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void credentials() {
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
	}
	
	@Test(priority=2)
	void submit() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}
	

}
