package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    //Application Negative Login:
    //Open chrome browser
    //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    //Enter valid username
    //Leave password field empty
    //Click on login button
    //Verify error message with text “Password cannot be empty” is displayed.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName= driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement loginButton=driver.findElement(By.cssSelector("input#btnLogin"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement errorMessage= driver.findElement(By.cssSelector("span#spanMessage"));
        System.out.println(errorMessage.isDisplayed());
    }
}
