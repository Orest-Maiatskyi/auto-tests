package pages.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputLoginPage {

    @FindBy(xpath = "//*[contains(@id, 'identifierId')]")
    private WebElement loginField;
    @FindBy(xpath = "//*[contains(@id, 'identifierNext')]/div/button")
    private WebElement goNextBtn;

    public WebDriver driver;

    public InputLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputLogin(String login) { loginField.sendKeys(login); }

    public void clickGoNextBtn() { goNextBtn.click(); }
}
