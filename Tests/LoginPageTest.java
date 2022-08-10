package Tests;

import Pages.LoginPage;
import TestBase.BasedClass;

public class LoginPageTest {
    public static void main(String[] args) {
        BasedClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php");
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("Admin");
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();

        BasedClass.tearDown();
    }
}
