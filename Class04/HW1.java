package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    //Open Chrome browser
    //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    //Enter valid username and password (username - Admin, password - Hnhrm123um@)
    //Click on login button
    //Then verify Syntax Logo is displayed. if condition
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
        loginButton.click();

        WebElement syntaxLogo = driver.findElement(By.cssSelector("img[src $= 'syntax.png']"));

        if (syntaxLogo.isDisplayed()){
            System.out.println("Logo Displayed");
        }else{
            System.out.println("Logo is not displayed.");
        }
        driver.quit();



    }
}
