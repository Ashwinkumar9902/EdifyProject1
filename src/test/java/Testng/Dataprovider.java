package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider
{
	WebDriver driver;
	@DataProvider(name="logindata")
	public Object[][] providedata()
	{
		return new Object[][] {
			{"sagar", "sagar1234@gmail.com", "2739893488"},
			{"abhi", "abhi1234@gmail.com", "8977479223"},
			//{"deepak", "deepak1234@gmail.com", "8926580274"},
			
		};
	}
	
	
	@Test(priority=1)
	void openURL() {
		driver = new ChromeDriver();
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.manage().window().maximize();

	}
	
	@Test(priority=2)
	void credentials() {
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}
	
	@Test(priority=3,dataProvider="logindata")
	public void createlead(String name,String email,String phone) {
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement Lead = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']")));
		Lead.click();
		WebElement CreateLead = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Lead']")));
		CreateLead.click();
		
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("phone")).sendKeys(phone);
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
	}
	
	

}
