package com.spartaglobal.SeleniumExample;

import com.spartaglobal.SeleniumExample.BbcSite.BBCSite;
import com.spartaglobal.SeleniumExample.SeleniumConfig.SeleniumConfig;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcSiteTests {
    private static String incorrectFormatUsernameErrorText = "Sorry, that email doesn’t look right. Please check it's a proper email.";
    private static BBCSite bbcSite;


    @BeforeClass
    public static void prerequesites(){
        SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome", "C:\\Users\\Pawel Misiura\\Downloads\\chromedriver_win32\\chromedriver.exe");
        bbcSite = new BBCSite(chromeDriverConfig.getDriver());
    }

    @Test
    public void incorrectUsernameFormatTest(){
        Assert.assertEquals(incorrectFormatUsernameErrorText, bbcSite.bbcSignInPage().goToBBCSignInPage().inputUsername("Test@").sendTabKey().getUsernameErrorMessageText());

    }
}
