package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods {
    @FindBy(id = "welcome")
    public WebElement welcomeAdmin;

    @FindBy(xpath = "//a[text() = 'Logout']")
    public WebElement logout;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}
