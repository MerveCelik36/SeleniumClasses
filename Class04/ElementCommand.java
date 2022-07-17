package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommand {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement gender= driver.findElement(By.xpath("//label[text()='Male']"));
        System.out.println(gender.isEnabled());
        gender.click();
        Thread.sleep(2000);
        WebElement age= driver.findElement(By.cssSelector("input[value='5 - 15']"));
        System.out.println(age.isEnabled());
        System.out.println(age.isDisplayed());
        System.out.println("Before clicking " +age.isSelected());
        Thread.sleep(2000);
        age.click();
        System.out.println("After clicking "+age.isSelected());
        driver.quit();
    }
}
