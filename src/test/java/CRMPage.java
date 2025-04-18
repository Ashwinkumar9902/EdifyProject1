import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMPage {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://dev.crm.digitaledify.ai/");
		
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		/*
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Campaigns']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Campaign']"))).click();
		
		driver.findElement(By.name("name")).sendKeys("sagar");
		driver.findElement(By.name("description")).sendKeys("Learning Automation Testing");
		
		WebElement element = driver.findElement(By.name("campaignOwner"));          //here element is the variable we can give anything
		Select select = new Select(element);
		select.selectByIndex(2);                                                    //repeated variables are not aloud
		//select.selectByValue("fd2f9ef9-52be-4c92-a83c-1fc97d7cb1a4");
		//select.selectByVisibleText("Admin");
		
		WebElement element1 = driver.findElement(By.name("type"));
		Select select1 = new Select(element1);
		//select1.selectByIndex(4);
		//select1.selectByValue("WhatsApp");
		select1.selectByVisibleText("Google");
		
		WebElement element2 = driver.findElement(By.name("status"));
		Select select2 = new Select(element2);
		select2.selectByIndex(1);
		
		WebElement element3 = driver.findElement(By.name("active"));
		Select select3 = new Select(element3);
		select3.selectByIndex(1);
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='campaignDate']"))).sendKeys("03/15/2025");
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='endDate']"))).sendKeys("03/20/2025");
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		//end   */
		
		//Leads Tab
		
		/*
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Lead']"))).click();
		
		driver.findElement(By.name("name")).sendKeys("abhi");  
		driver.findElement(By.name("email")).sendKeys("abhi1234@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9823473957");
		driver.findElement(By.name("description")).sendKeys("Learning Automation testing");
		
		WebElement element = driver.findElement(By.name("courseList"));
		Select select = new Select(element);
		select.selectByIndex(4);
		//select.selectByValue("Java");
		//select.selectByVisibleText("Java");
		
		WebElement element1 = driver.findElement(By.name("programs"));
		Select select1 = new Select(element1);
		//select1.selectByIndex(2);
		select1.selectByValue("Full Stack Java");
		//select1.selectByVisibleText("Full Stack Java");
		
		WebElement element2 = driver.findElement(By.name("techStack"));
		Select select2 = new Select(element2);
		//select2.selectByIndex(2);
		//select2.selectByValue("Application Stack");
		select2.selectByVisibleText("Application Stack");
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		//end 
		*/
		
		//Opportunities Tab
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Opportunities']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Opportunitiy']"))).click();
		
		driver.findElement(By.name("name")).sendKeys("Shreenivas");  
		driver.findElement(By.name("email")).sendKeys("shree1234@gmail.com");
		driver.findElement(By.name("countryCode")).sendKeys("91");
		driver.findElement(By.name("phone")).sendKeys("3769746835");
		driver.findElement(By.name("description")).sendKeys("Learning Automation testing");
		
		WebElement element = driver.findElement(By.name("techStack"));
		Select select = new Select(element);
		select.selectByIndex(2);
		
		WebElement element1 = driver.findElement(By.name("courseList"));
		Select select1 = new Select(element1);
		select1.selectByIndex(4);
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
          //end
		
		
		//Learners Tab
        /*
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Learners']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Learner']"))).click();
		
		driver.findElement(By.name("name")).sendKeys("Prashant");  
		driver.findElement(By.name("email")).sendKeys("shree1234@gmail.com");
		driver.findElement(By.name("search_name_input")).sendKeys("sagar");
		driver.findElement(By.name("phone")).sendKeys("1923749758");
		driver.findElement(By.name("description")).sendKeys("Learning Automation testing");
		
		WebElement element = driver.findElement(By.name("location"));
		Select select = new Select(element);
		select.selectByIndex(2);
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='registeredDate']"))).sendKeys("03/11/2025");
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		*/
		
		//Batches
		/*
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Batches']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Batch']"))).click();
		
		driver.findElement(By.name("batchName")).sendKeys("shrinath");  
		driver.findElement(By.name("description")).sendKeys("Learning Automation testing");
		
		WebElement element = driver.findElement(By.name("location"));
		Select select = new Select(element);
		select.selectByIndex(2);
		
		WebElement element1 = driver.findElement(By.name("slot"));
		Select select1 = new Select(element1);
		select1.selectByIndex(2);
		
		WebElement element2 = driver.findElement(By.name("stack"));
		Select select2 = new Select(element2);
		select2.selectByIndex(2);
		
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='startDate']"))).sendKeys("03/11/2025");
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='tentativeEndDate']"))).sendKeys("03/15/2025");

		driver.findElement(By.xpath("//button[text()='Save']")).click();
        */ //end
		
		//Trainers
        /*
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Trainers']"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Trainer']"))).click();
		
		driver.findElement(By.name("trainerName")).sendKeys("Ashwin");           
		driver.findElement(By.name("trainerId")).sendKeys("20030302");        
		driver.findElement(By.name("countryCode")).sendKeys("91");
		driver.findElement(By.name("phone")).sendKeys("4326574362"); 
		driver.findElement(By.name("email")).sendKeys("ashwin1234@gmail.com");
		driver.findElement(By.name("description")).sendKeys("Learning Automation testing");
		
		WebElement element = driver.findElement(By.name("trainerStatus"));
		Select select = new Select(element);
		select.selectByIndex(2);
		
		WebElement element1 = driver.findElement(By.name("location"));
		Select select1 = new Select(element1);
		select1.selectByIndex(1);

		driver.findElement(By.xpath("//button[text()='Create']")).click();
		*/
			
	}

}