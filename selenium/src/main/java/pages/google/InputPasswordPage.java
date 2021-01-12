package pages.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.java2d.cmm.Profile;
import sun.security.util.Password;

public class InputPasswordPage {

    @FindBy(xpath = "//*[contains(@id, 'password')]/div/div/div/input")
    private WebElement passwordField;
    @FindBy(xpath = "//*[contains(@id, 'passwordNext')]/div/button")
    public WebElement loginBtn;

    public WebDriver driver;

    public InputPasswordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputPassword(String password) { passwordField.sendKeys(password); }

    public void clickLoginBtn() { loginBtn.click(); }
}
