package com.spartaglobal.SeleniumExample.BbcSite;

import com.spartaglobal.SeleniumExample.BbcSite.pages.BBCHomepage;
import com.spartaglobal.SeleniumExample.BbcSite.pages.BBCSignInPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BBCSite {
    private WebDriver driver;
    private BBCHomepage bbcHomepage;
    public BBCSignInPage bbcSignInPage;

    public BBCSite(WebDriver driver) {
        this.driver = driver;

        driver.manage().window().setSize(new Dimension(400, 400));


        this.bbcHomepage = new BBCHomepage(driver);
        this.bbcSignInPage = new BBCSignInPage(driver);
    }

    public BBCHomepage bbcHomepage(){
        return bbcHomepage;
    }
    public BBCSignInPage bbcSignInPage(){
        return bbcSignInPage;
    }
}
