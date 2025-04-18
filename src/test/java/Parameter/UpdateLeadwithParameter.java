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

public class UpdateLeadwithParameter
{
	WebDriver driver;
	WebDriverWait mywait;
	
	@BeforeClass()
	void Login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		mywait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
        //URL & Credentials
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
			
	}
	
	@Test(priority=1)
	@Parameters("courseList")
	 public void updateLead(String CourseList) {
		
		Actions actions = new Actions(driver);
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='akash']"))).click();
		
		WebElement updatelead= mywait.until(ExpectedConditions.elementToBeClickable(By.name("courseList")));
	   // WebElement updatelead = driver.findElement(By.name("courseList"));
		actions.doubleClick(updatelead).perform();
	    Select select = new Select(updatelead);
	    select.selectByIndex(2);
	    System.out.println("Selected:  " + CourseList);
	    
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	
	@Test(priority=2)
	@Parameters("warmStage")
	public void Updatelead(String WarmStage) {
	    
		Actions actions = new Actions(driver);
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='akash']"))).click();
		
		WebElement Updateinlead = mywait.until(ExpectedConditions.elementToBeClickable(By.name("warmStage")));
		actions.doubleClick(Updateinlead).perform();
		Select select = new Select(Updateinlead);
		select.selectByVisibleText("warmStage");
		System.out.println("Selected: " + WarmStage);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

	@Test(priority=3)
	@Parameters("techStack")
	public void Updateleads(String TechStack) {
	    
		Actions actions = new Actions(driver);
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='akash']"))).click();
		
		WebElement Updateinleads = mywait.until(ExpectedConditions.elementToBeClickable(By.name("techStack")));
		actions.doubleClick(Updateinleads).perform();
		Select select = new Select(Updateinleads);
		select.selectByVisibleText("Platform Stack");
		System.out.println("Selected: " + TechStack);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

	@Test(priority=4)
	@Parameters("leadSource")
	 public void updateLeads(String LeadSource) {
		
		Actions actions = new Actions(driver);
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='akash']"))).click();
		
		WebElement updateleads = mywait.until(ExpectedConditions.elementToBeClickable(By.name("leadSource")));
	   // WebElement updateleads = driver.findElement(By.name("courseList"));
		actions.doubleClick(updateleads).perform();
	    Select select = new Select(updateleads);
	    select.selectByIndex(2);
	    System.out.println("Selected:  " + LeadSource);
	    
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	
	
}
