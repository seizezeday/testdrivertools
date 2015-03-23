package com.drivertools.pageobjects;

import com.drivertools.service.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class LoginPage extends LoadableComponent<LoginPage> {
    private final WebDriver driver;
    @FindBy(how = How.ID, using = Constants.LOGIN_BUTTON_ID)
    public WebElement loginButton;

    @FindBy(how = How.ID, using = Constants.LOGIN_EMAIL_ID)
    public WebElement loginEmail;

    @FindBy(how = How.ID, using = Constants.LOGIN_PASSWORD_ID)
    public WebElement loginPassword;

    @FindBy(how = How.CSS, using = Constants.LOGIN_LINK_CSS)
    public WebElement loginLink;

    @FindBy(how = How.CSS, using = Constants.REGISTER_LINK_CSS)
    public WebElement registerLink;



    /*
    default login account
     */




    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @Override
    public void load() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        driver.get(Constants.LOGIN_PAGE_URL_START);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait.until(ExpectedConditions. visibilityOfAllElements(Arrays.asList(loginButton, loginEmail, loginLink, registerLink, loginPassword)));

    }

    @Override
    protected void isLoaded() throws Error {

        String url = driver.getCurrentUrl();
        Assert.assertTrue("The wrong page has loaded. Ending part of ULR doesn't match", url.contains(Constants.LOGIN_PAGE_URL_ENDING));
        Assert.assertTrue("The wrong page has loaded. Starting part of URL doesn't match", url.startsWith(Constants.LOGIN_PAGE_URL_START));

    }

    public void login(){
        loginEmail.sendKeys(Constants.TEST_EMAIL);
        loginPassword.sendKeys(Constants.TEST_PASSWORD);
        loginButton.click();
        //WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*=home]")));

        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout1")));

    }

    public boolean isElementDisplayed(WebElement element){
        //WebDriverWait wait = new WebDriverWait(driver,10);
        //return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        return element.isDisplayed();

    }

}
