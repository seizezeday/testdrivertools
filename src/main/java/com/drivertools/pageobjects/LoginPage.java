package com.drivertools.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

/**
 * Created by Vasya on 09.03.2015.
 */
public class LoginPage extends LoadableComponent<LoginPage> {
    WebDriver selenium;

    public LoginPage(WebDriver selenium) {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
    }

    @Override
    public void load() {
        selenium.get("http://rotterdam-cj5.rhcloud.com/");
    }

    @Override
    protected void isLoaded() {
        String url = selenium.getCurrentUrl();
        if (url.startsWith("http://rotterdam-cj5.rhcloud.com/")) {
            try {
                throw new Exception("The wrong page has loaded");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
    @FindBy(how = How.NAME, using = "login-btn")
    WebElement loginButton;

    public boolean isButtonDisplayed(String loginButtonId){
        return selenium.findElement(By.id(loginButtonId)).isDisplayed();
    }

}
