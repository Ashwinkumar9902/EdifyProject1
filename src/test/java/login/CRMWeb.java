package login;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMWeb {
	
	@Test
	public void log() {
	WebDriverManager.chromedriver().setup();

		
    WebDriver driver = new ChromeDriver();
	//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
	
	//Actions actions = new Actions(driver);
	driver.manage().window().maximize();
	driver.get("https://dev.crm.digitaledify.ai/");
	
	driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
	driver.findElement(By.name("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.close();

}
}
