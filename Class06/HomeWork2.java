package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class HomeWork2 {
       /*
        Go to https://syntaxprojects.com/javascript-alert-box-demo.php
        click on each button and handle the alert accordingly
       */
    public static void main(String[] args) throws InterruptedException {
        String url="https://syntaxprojects.com/javascript-alert-box-demo.php";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandle = driver.getWindowHandle();

        WebElement clickMe1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        clickMe1.click();
        Thread.sleep(2000);
        Alert alert1=driver.switchTo().alert();
        alert1.accept();

        WebElement clickMe2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        clickMe2.click();
        Thread.sleep(2000);
        Alert alert2= driver.switchTo().alert();
        alert2.dismiss();

        WebElement clickMe3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickMe3.click();
        Thread.sleep(2000);
        Alert alert3= driver.switchTo().alert();
        alert3.sendKeys("Merve");
        alert3.accept();






    }
}
