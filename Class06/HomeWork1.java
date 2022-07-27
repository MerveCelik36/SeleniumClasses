package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    //Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    //verify the header text Sorry, We Couldn't Find Anything For "Asksn" is displayed
    //verify enroll today button is enabled
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame("FrameOne");
        WebElement header = driver.findElement(By.className("heading-13"));
        String headerText = header.getText();
        if (headerText.equals("Sorry, We Couldn't Find Anything For “Asksn”")) {
            System.out.println("Header text is verified");
        } else {
            System.out.println("Header text is not verified");
        }
        driver.switchTo().defaultContent().switchTo().frame("FrameTwo");
        WebElement enrollButton = driver.findElement(By.xpath("//a[text()='Enroll']"));
        if (enrollButton.isEnabled()) {
            System.out.println("Enroll button is enabled");
        } else {
            System.out.println("Enroll button is not enabled");
        }
    }



    }

