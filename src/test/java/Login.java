import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
             


public class Login {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
	    
	    	driver.manage().window().maximize();                       //this is for maximizing the window
		    driver.get("https://dev.rms.digitaledify.ai/");
		
		driver.findElement(By.id("username")).sendKeys("admin11");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		
		
	}

}
