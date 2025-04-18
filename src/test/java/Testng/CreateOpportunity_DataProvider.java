package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateOpportunity_DataProvider
{
	WebDriver driver;
	WebDriverWait mywait;
	@DataProvider(name="data")
	public Object[][] providedata() 
	{
		return new Object[][] {
			{"abhijeet", "abhijeet123@gmail.com", "+91", "9972648263"},
			{"Deepak", "Deepak1234@gmail.com", "+91", "9987478366"},
			//{"abhishek", "abhi12@gmail.com", "+91", "9973687232"},
		};
	}
	
	@Test(priority=1)
	void URL() {
		driver = new ChromeDriver();
		mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}
	@Test(priority=2,dataProvider="data")
	void CreateOpp(String name, String email, String countryCode, String phone) {
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Opportunities']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Opportunitiy']"))).click();
		
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("countryCode")).sendKeys(countryCode);
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
	}
	@Test(priority=3)
	void close() {
		driver.quit();
	}

}
