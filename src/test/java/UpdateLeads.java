import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateLeads {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://dev.crm.digitaledify.ai/");
		
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		Actions actions = new Actions(driver);
		
		WebElement LeadsElement = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']")));
		
		actions.click(LeadsElement).perform();
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='akash']"))).click();
		
		WebElement WarmLead = mywait.until(ExpectedConditions.elementToBeClickable(By.name("courseList")));
		actions.doubleClick(WarmLead).perform();
		
		Select select = new Select(WarmLead);
		select.selectByVisibleText("Python");
		
	}

}
