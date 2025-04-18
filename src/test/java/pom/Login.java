package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login
{
	WebDriverWait mywait;
	
	@FindBy(id="email")
	private WebElement emailField;
	@FindBy(name="password")
	private WebElement passwordField;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Leads']")
	private WebElement leadTab;
	
	@FindBy(xpath="//button[text()='Create Lead']")
	private WebElement createleadbutton;
	
	@FindBy(name="name")
	private WebElement CanName;
	
	@FindBy(name="email")
	private WebElement Canemail;
	
	@FindBy(name="phone")
	private WebElement CanPhone;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement CreateButton;
	
	public Login(WebDriver driver) {       //array name & class name Should same
	    mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
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
		
		mywait.until(ExpectedConditions.elementToBeClickable(leadTab));
		leadTab.click();
		
	}

	public void clickCreateLead() {
		mywait.until(ExpectedConditions.elementToBeClickable(createleadbutton));
	    createleadbutton.click();
	}

	public void enterName(String name) {
	
		CanName.sendKeys(name);
	}

	public void enterPhone(String phone) {
		
		CanPhone.sendKeys(phone);
		
	}

	public void enteremail(String email) {
	
		Canemail.sendKeys(email);
	}

	public void clickCreate() {
		
		 CreateButton.click();
	}
	

}
