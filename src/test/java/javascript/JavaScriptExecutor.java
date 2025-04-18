package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=8730024826650534517&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9184631&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;                   //this is a method for scrolling down the window
		
		//js.executeScript("window.scroll(0,300)");
		
		WebElement element = driver.findElement(By.xpath("//div[@class='a-cardui-body']"));
		js.executeScript("arguments[0].scrollIntoview(true);", element);
		
		
	}

}
