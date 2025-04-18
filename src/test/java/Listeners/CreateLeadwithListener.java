package Listeners;

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





//@Listeners(Listeners.MyListeners)            this is the second method for integration the class

public class CreateLeadwithListener
{
	WebDriver driver;
	WebDriverWait mywait;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void credentials() {
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
	}

	@Test(priority=2)
	void button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();    //login 
	}
	
	@Test(priority=3, dependsOnMethods = {"button"})
	void updatelead() {
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Lead']"))).click();
		
		driver.findElement(By.name("name")).sendKeys("shrinath");
		driver.findElement(By.name("email")).sendKeys("shrinath@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9973456873");
	    driver.findElement(By.name("description")).sendKeys("testing automation");
	
		/*WebElement lead = driver.findElement(By.name("courseList"));
		Select select = new Select(lead);
		select.deselectByIndex(2);
		
		WebElement lead1 = driver.findElement(By.name("programs"));
		Select select1 = new Select(lead1);
	    select1.deselectByIndex(2);
	    
	    WebElement lead2 = driver.findElement(By.name("techStack"));
	    Select select2 = new Select(lead2);
	    select2.deselectByIndex(2);
		*/
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
	}
	

}
	
