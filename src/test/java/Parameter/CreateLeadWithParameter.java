package Parameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CreateLeadWithParameter
{
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
	@Parameters({"name", "email", "phone"})
	void createlead(String name, String email, String phone) {
		
		//Locating lead
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Lead']"))).click();
		
		//Creating lead
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("phone")).sendKeys(phone);
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
	}	
	@Test(priority=2)
	@Parameters("programs")
	 public void updateLead(String programs) {
		
		Actions actions = new Actions(driver);
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='deepak']"))).click();
		
		WebElement updatelead= mywait.until(ExpectedConditions.elementToBeClickable(By.name("programs")));
	    actions.doubleClick(updatelead).perform();
	    Select select = new Select(updatelead);
	    select.selectByVisibleText(programs);
	    System.out.println("Selected:  " + programs);
	    
	}
	

}
