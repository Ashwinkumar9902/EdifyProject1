package excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExcel {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
	String filepath = "D:\\eclipse\\Seleniumproject\\Test Data\\Login2.xlsx";
	String SheetName ="Sheet1";
	Object[][] credentials= ExcelUtil.loadExcel(filepath, SheetName);
	
	for(Object[] credential:credentials) {
		
		String email = credential[0].toString();
		String password = credential[1].toString();
		
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
	}
	
	}

}
