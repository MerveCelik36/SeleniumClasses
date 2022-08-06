package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http:/www.fb.com");
        driver.navigate().back();
        driver.navigate().forward();

        driver.findElement(By.id("email")).sendKeys("mnbkhg@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Nbljhv");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Forget password")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
    }
}
