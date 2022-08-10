package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static TestBase.BasedClass.driver;

public class LoginPageWithPageFactory {
    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy(xpath = "//input[@name = 'txtPassword']")
    public WebElement password;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;

//    @FindBy(css = "input#btnLogin")
//    public List<WebElement> multipleElements;

    public LoginPageWithPageFactory() {
        PageFactory.initElements(driver, this);
    }
}
