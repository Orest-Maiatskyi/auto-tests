package pages.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

    public WebDriver driver;
    public UserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'gb_71')]")
    private WebElement logoutBtn;

    @FindBy(xpath = "//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div/a/img")
    private WebElement sideBarBtn;


    public void clickSideBarBtn() { sideBarBtn.click(); }

    public void clickLogoutBtn() { logoutBtn.click(); }
}
