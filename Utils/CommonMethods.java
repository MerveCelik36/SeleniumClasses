package Utils;

import org.openqa.selenium.WebDriver;

public class CommonMethods {
    public static void openBrowser(WebDriver driver, String url){
        driver.manage().window().maximize();
        driver.get(url);
    }
    public static void quitBrowser(WebDriver driver){
        driver.quit();
    }
}
