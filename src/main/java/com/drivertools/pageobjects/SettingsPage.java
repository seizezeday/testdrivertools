package com.drivertools.pageobjects;

import com.drivertools.service.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import com.drivertools.pageobjects.LoginPage;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SettingsPage extends LoadableComponent<SettingsPage> {
    private final WebDriver driver;
    //private final LoadableComponent<?> parent;


    public SettingsPage(WebDriver driver){
        this.driver = driver;
       // this.parent = parent;

    }

    @Override
    protected void load() {
        LoginPage loginPage = new LoginPage(driver).get();
        loginPage.login();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout")));


    }

    @Override
    protected void isLoaded() throws Error {
        String url = driver.getCurrentUrl();
        Assert.assertTrue("The wrong page has loaded", url.endsWith(Constants.SETTINGS_PAGE_URL_ENDING));

    }
}
