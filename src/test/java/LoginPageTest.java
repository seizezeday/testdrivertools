import com.drivertools.pageobjects.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

/**
 * Created by Vasya on 09.03.2015.
 */
public class LoginPageTest {
    WebDriver selenium;
    @Before
    public void prepareComponents() throws IOException {
        selenium = new FirefoxDriver();

    }
    @After
    public void clearEnvironment(){
        selenium.quit   ();
    }

    @Test
    public void shouldLoadTheLoginPageAndCheckButtons(){
        LoginPage loginPage = new LoginPage(selenium).get();
        loginPage.load();
        loginPage.isButtonDisplayed("login-btn");
    }
}
