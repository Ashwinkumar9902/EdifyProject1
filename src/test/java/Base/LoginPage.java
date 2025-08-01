package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;

    // Page elements
    By emailField = By.name("email");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By eyeIcon = By.xpath("//img[@alt='Password Not Visible']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void enterEmail(String email) {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
    }

    public void enterPassword(String password) {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    public void clickLogin() {
    	wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void clickEyeIcon() {
    	wait.until(ExpectedConditions.elementToBeClickable(eyeIcon)).click();
    }

    
    public boolean isLoginButtonEnabled() {
    	return wait.until(ExpectedConditions.presenceOfElementLocated(loginButton)).isEnabled();
    }

    public boolean isPasswordMasked() {
    	WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        return passwordInput.getAttribute("type").equals("password"); 
    }

    public String getErrorMessage() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='normal-text']"))).getText(); 
    }

    public boolean isElementVisible(By locator) {
    	return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)).size() > 0;
    }


}
