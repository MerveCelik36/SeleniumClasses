package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    //Navigate to http://syntaxprojects.com
    //Click on start practicing
    //click on simple form demo
    //enter any text on first text box
    //click on show message
    //quit the browser
    //try to use xpath
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
        WebElement startPracticing= driver.findElement(By.xpath("//a[text() = ' Start Practising ']"));
        startPracticing.click();
        Thread.sleep(2000);
        WebElement simpleForm= driver.findElement(By.xpath("(//a[@href='basic-first-form-demo.php'])[2]"));
        simpleForm.click();
        Thread.sleep(2000);
       WebElement message= driver.findElement(By.xpath("//input[@id='user-message']"));
       message.sendKeys("Hello World!");
        Thread.sleep(2000);
       WebElement showMessage= driver.findElement(By.xpath("(//button[@type='button'])[1]"));
       showMessage.click();
        Thread.sleep(2000);
        driver.quit();


    }
}
