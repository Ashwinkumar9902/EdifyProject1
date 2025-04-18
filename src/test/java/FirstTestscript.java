import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestscript {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://dev.crm.digitaledify.ai/");
		System.out.println("page title"+ driver.getTitle());
		
		
	}
}
