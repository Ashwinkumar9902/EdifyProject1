package ProjectOnLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginLMS
{
	WebDriver driver;
	
	@Parameters("browser")
	@Test(priority=1)
	public void setup(String browser) {
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
		
		driver.findElement(By.name("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}		
	/*@Test(priority=1)
	@Parameters({"Email", "Password"})
	public void login(String Email, String Password) {
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		//driver.get(URL);
		//driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
*/
}

// <parameter name="URL" value="https://dev.lms.digitaledify.ai/"></parameter>
