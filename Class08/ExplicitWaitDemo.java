package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;

public class ExplicitWaitDemo {
    public static String url = "http://syntaxprojects.com/dynamic-data-loading-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement getNewUser= driver.findElement(By.cssSelector("button#save"));
        getNewUser.click();

        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name :')]")));
        WebElement firstName= driver.findElement(By.xpath("//p[contains(text(),'First Name :')]"));
        //why we put here only partial value, because name changes all the time, that's why we did not use the full text,
        //just took the common part by .contains method.
        System.out.println(firstName.getText());
    }
}
