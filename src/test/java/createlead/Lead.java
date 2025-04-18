package createlead;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lead {
	
	WebDriver driver;
	WebDriverWait mywait;
	
	@BeforeClass()
	void Login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
        //URL & Credentials
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	@Test(priority=1)
	
	void createLead() {
		
		//Locating lead
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Lead']"))).click();
		
		//Creating lead
		driver.findElement(By.name("name")).sendKeys("abhijeet");
		driver.findElement(By.name("email")).sendKeys("abhi123456@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9973647622");
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();

}
}
