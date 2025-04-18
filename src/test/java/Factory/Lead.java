package Factory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Lead {
	private String email;
	private String password;
	private String leadName;
	private String leadEmail;
	private String leadPhone;
	
	//how do we assign value to the constructor -- with the help of "this." keyword
	public Lead(String email,String password,String leadName,String leadEmail,String leadPhone) {
		this.email = email;
		this.password = password;
		this.leadName = leadName;
		this.leadEmail = leadEmail;
		this.leadPhone = leadPhone;
	}
		
	@Test
	public void createlead() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement leadsTab = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']")));
		leadsTab.click();
		
		WebElement createLead = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Lead']")));
		createLead.click();
        
		driver.findElement(By.name("name")).sendKeys(leadName);
		driver.findElement(By.name("email")).sendKeys(leadEmail);
		driver.findElement(By.name("phone")).sendKeys(leadPhone);
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();

	}
	
	
	
	
	
}
