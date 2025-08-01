package ProjectOnLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SignIn
{
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void signUp(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("Chrome is launched");
		} else if  (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			System.out.println("Edge is launched");
	    } else if  (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Firefox is launched");
	    }
		
		driver.get("https://dev.lms.digitaledify.ai");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		driver.findElement(By.name("name")).sendKeys("Admin");
		driver.findElement(By.name("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();

}
}