package com.spartaglobal.SeleniumExample;

import com.spartaglobal.SeleniumExample.BbcSite.BBCSite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pawel Misiura\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        BBCSite bbcSite = new BBCSite(chromeDriver);

        bbcSite.bbcSignInPage().goToBBCSignInPage().inputUsername("abc").inputPassword("test").clickSignInButton();

    }
}
