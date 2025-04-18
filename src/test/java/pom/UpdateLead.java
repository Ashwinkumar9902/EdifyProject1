package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateLead {
	WebDriverWait mywait;
	
	@FindBy(id="email")
	private WebElement emailField;
	@FindBy(name="password")
	private WebElement passwordField;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Leads']")
	private static WebElement leadTab;
	
	@FindBy(xpath="//span[text()='avi']")
	private WebElement Lead;

	public UpdateLead(WebDriver driver) { 
		PageFactory.initElements(driver,this);
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
		
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
		
	}

	public void clickLogin() {
		loginButton.click();
		
	}

	public void clickLeads() {
       	leadTab.click();
	}

	public void clickavi() {
		Lead.click();
	}
    
     

}
