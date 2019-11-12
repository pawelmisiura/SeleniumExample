package com.spartaglobal.SeleniumExample.BbcSite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBCHomepage {
    private WebDriver driver;
    private String homepageURL = "https://www.bbc.co.uk/";
    private By signInLinkID = By.id("idcta-link");
    public BBCHomepage(WebDriver driver) {
        this.driver = driver;
    }
    public BBCHomepage goToBBCHomepage(){
        driver.navigate().to(homepageURL);
        return this;
    }
    public BBCHomepage clickSignInLink(){
        driver.findElement(signInLinkID).click();
        return this;
    }
    public void closeDriver(){
        driver.close();
    }

}
