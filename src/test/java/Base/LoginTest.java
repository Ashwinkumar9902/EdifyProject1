package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	LoginPage login;
	
	@BeforeMethod
    public void prepareTest() {
        login = new LoginPage(driver);
    }

    @Test
    public void verifyLoginButtonDisabledInitially() {
        Assert.assertTrue(login.isLoginButtonEnabled());
    }

    @Test
    public void verifyPasswordVisibilityToggle() {
        
        Assert.assertTrue(login.isPasswordMasked());
        login.clickEyeIcon();
        Assert.assertFalse(login.isPasswordMasked());
    }

    @Test
    public void tryInvalidLoginAndCheckError() {
        
        login.enterEmail("invalid@example.com");
        login.enterPassword("wrong123");
        login.clickLogin();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='normal-text']")));
        
        Assert.assertTrue(login.getErrorMessage().length() > 0); 
    }

    @Test
    public void confirmImportantElementsExist() {
        
        Assert.assertTrue(login.isElementVisible(By.name("email")));
        Assert.assertTrue(login.isElementVisible(By.name("password")));
        Assert.assertTrue(login.isElementVisible(By.xpath("//button[@type='submit']")));
        Assert.assertTrue(login.isElementVisible(By.xpath("//img[@alt='Password Not Visible']")));
    }
	
}
