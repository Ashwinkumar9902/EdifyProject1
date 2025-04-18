import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://dev.crm.digitaledify.ai/");
		
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		WebElement practice = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']")));
        practice.click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='akash']"))).click();
        
		
		/*WebElement AkashLead =driver.findElement(By.name("nextFollowUp"));
		actions.doubleClick(AkashLead).perform();
		
		Select select = new Select(AkashLead);
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='nextFollowUp']"))).sendKeys("04/15/2025");
        */
		
		WebElement nextFollowUp = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='nextFollowUp']")));
		
		actions.doubleClick(nextFollowUp);
		nextFollowUp.clear();
		nextFollowUp.click();
		nextFollowUp.sendKeys("10/02/2025");
		nextFollowUp.sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
			
	}

}
