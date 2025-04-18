package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLeadWithTestng
{
	WebDriver driver;
	WebDriverWait mywait;
	
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
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
	void login() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
	@Test(priority=3)
	void leads() {
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();	
	}
	
	@Test(priority=4)
	void createlead() {
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Lead']"))).click();
		
	}
	
	@Test(priority=5)
	void data() {
		
		driver.findElement(By.name("name")).sendKeys("rajahuli");  
		driver.findElement(By.name("email")).sendKeys("abhi123@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9823447957");
		driver.findElement(By.name("description")).sendKeys("Learning Automation testing");
		
		WebElement element = driver.findElement(By.name("courseList"));
		Select select = new Select(element);
		select.selectByIndex(4);
		
		WebElement element1 = driver.findElement(By.name("programs"));
		Select select1 = new Select(element1);
		select1.selectByIndex(2);
		
		WebElement element2 = driver.findElement(By.name("techStack"));
		Select select2 = new Select(element2);
		select2.selectByIndex(2); 
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
	}
	
	

}      

