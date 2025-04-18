package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLearnersWithTestng
{
	WebDriver driver;
	WebDriverWait mywait;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
	@Test
	void updatelead() {
		//Actions actions = new Actions(driver);
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Learners']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Learner']"))).click();
		

		
		
	}
	
	@AfterClass
	void close() {
		driver.quit();
	}
	
}
