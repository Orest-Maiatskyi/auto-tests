package org.example.googleTests;

import org.example.ConfProperties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.google.InputLoginPage;
import pages.google.InputPasswordPage;
import pages.google.UserPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {                              // J behave
    public static InputLoginPage loginPage;
    public static InputPasswordPage passwordPage;
    public static UserPage userPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        loginPage = new InputLoginPage(driver);
        passwordPage = new InputPasswordPage(driver);
        userPage = new UserPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void loginTest() {
        loginPage.inputLogin(ConfProperties.getProperty("user.login"));
        loginPage.clickGoNextBtn();
        passwordPage.inputPassword(ConfProperties.getProperty("user.password"));
        passwordPage.clickLoginBtn();
    }

    @AfterClass
    public static void tearDown() {
        userPage.clickSideBarBtn();
        userPage.clickLogoutBtn();
        driver.quit();
    }
}
