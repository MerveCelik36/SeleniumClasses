package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClassDemo {
   public static String url ="http://www.amazon.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       WebElement accountAndList= driver.findElement(By.id("nav-link-accountList"));
        Actions action =new Actions(driver);
        action.moveToElement(accountAndList).perform( );
        driver.quit();

    }
}
