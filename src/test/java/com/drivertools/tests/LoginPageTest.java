package com.drivertools.tests;

import com.drivertools.pageobjects.LoginPage;
import com.drivertools.pageobjects.SettingsPage;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class LoginPageTest {
    WebDriver driver;
    @Before
    public void prepareComponents() throws IOException {
        driver = new FirefoxDriver();

    }
    @After
    public void clearEnvironment(){
        driver.quit();
    }


    @Test
    @Ignore
    public void shouldLoadTheLoginPageAndCheckButtonsAndFields(){
        LoginPage loginPage = new LoginPage(driver).get();
        assertEquals(loginPage.loginButton.isDisplayed(), true);
        assertEquals(loginPage.loginButton.isDisplayed(), true);
        assertEquals(loginPage.loginEmail.isDisplayed(), true);
        assertEquals(loginPage.loginPassword.isDisplayed(), true);
        assertEquals(loginPage.loginLink.isDisplayed(), true);
        assertEquals(loginPage.registerLink.isDisplayed(), true);

    }

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(driver).get();
        loginPage.login();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("123")));
        assertEquals(driver.getCurrentUrl().contains("client"), true);



    }
    @Test
    public void testSettingsPage() {
        SettingsPage settingsPage = new SettingsPage(driver).get();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*=settings]")));
        assertEquals(driver.getCurrentUrl().contains("client"), true);
    }
}
