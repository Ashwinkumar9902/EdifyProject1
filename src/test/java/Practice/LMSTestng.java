package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LMSTestng 
{
	WebDriver driver = new ChromeDriver();
	WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(40));
	Actions actions = new Actions(driver);
	
	@BeforeClass()
	void setup() {
	driver.get("https://dev.my.digitaledify.ai");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("email")).sendKeys("admin@yopmail.com");
	driver.findElement(By.name("password")).sendKeys("123456");
	
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	
	@Test
	void model() throws InterruptedException {
		
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='mantine-UnstyledButton-root mantine-Button-root mantine-lewpo6']")).click();
	
	//WebElement Element1 = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='mantine-UnstyledButton-root mantine-Button-root mantine-lewpo6']")));  //span[text()='Admin']
	//Element1.click();
	
	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Java']"))).click();
	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()='Modules']"))).click();
	
	driver.findElement(By.xpath("//h5[text()='1. Module1']")).click();     
    
	WebElement Element = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Topic']")));    
	Element.click();                                                                             
	
	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='topics.0.title']"))).sendKeys("Wait Condition");         
	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='topics.0.videoLink']"))).sendKeys("https://vimeo.com/1065348902?share=copy");
	
	driver.findElement(By.xpath("//span[text()='Save']")).click();
	
	}
}
