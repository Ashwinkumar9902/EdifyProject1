import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(40));
		
		driver.manage().window().maximize();
		driver.get("https://dev.rms.digitaledify.ai/dashboard");
		
		driver.findElement(By.id("username")).sendKeys("admin11");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
        mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='hover:border-b-2 hover:border-b-[#5028CC] items-center relative text-black rounded-t pb-3 text-base font-normal cursor-pointer px-1 py-1 mx-0 xl:mx-0.5 xl:py-3 xl:px-2 xl:text-lg']"))).click();
	    mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='flex items-center gap-2 px-4 h-8 justify-center rounded-md bg-[#0176D3] p-1 text-sm font-normal leading-6 text-white']"))).click();
	   
	    
	    /*
	    driver.findElement(By.name("Job Title")).sendKeys("ManualTesting");
	    driver.findElement(By.name("Recruiter Name")).sendKeys("admin");
	    driver.findElement(By.name("Job Opening Status")).sendKeys("Upcoming");
	    driver.findElement(By.name("Company")).sendKeys("Wipro");
	    driver.findElement(By.name("Candidates")).sendKeys("new");
        */
		

	}

}
