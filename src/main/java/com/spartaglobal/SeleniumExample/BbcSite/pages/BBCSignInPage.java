package com.spartaglobal.SeleniumExample.BbcSite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BBCSignInPage {
    private WebDriver driver;
    private String bbcSignInPageURL = "https://account.bbc.com/signin";
    private By userNameFieldID = By.id("user-identifier-input");
    private By passwordFieldID = By.id("password-input");
    private By submitButtonId = By.id("submit-button");
    private By userNameErrorId = By.id("form-message-username");
    private By passwordErrorTextId = By.id("form-message-password");

    public BBCSignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public BBCSignInPage goToBBCSignInPage() {
        driver.navigate().to(bbcSignInPageURL);
        return this;
    }

    public BBCSignInPage inputUsername(String username) {
        driver.findElement(userNameFieldID).sendKeys(username);
        return this;
    }

    public BBCSignInPage inputPassword(String password) {
        driver.findElement(passwordFieldID).sendKeys(password);
        return this;
    }

    public BBCSignInPage clickSignInButton() {
        driver.findElement(submitButtonId).click();
        return this;
    }

    public String getUsernameErrorMessageText(){
        return driver.findElement(userNameErrorId).getText();
    }

    public String getPasswordErrorMessageText(){
        return driver.findElement(passwordErrorTextId).getText();
    }

    public BBCSignInPage sendTabKey(){
        driver.findElement(passwordFieldID).sendKeys(Keys.TAB);
        return this;
    }

}