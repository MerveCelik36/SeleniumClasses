package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {
    /*Go to facebook sign up page
    Fill out the whole form
    Click signup*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Kelly");
        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Ben");
        WebElement phoneNumber= driver.findElement(By.xpath("//input[@name='reg_email__']"));
        phoneNumber.sendKeys("21502435752");
        WebElement password= driver.findElement(By.cssSelector("input#password_step_input"));
        password.sendKeys("nbxdvkasjghdfl");
        WebElement month= driver.findElement(By.xpath("birthday_month"));
        month.click();
        Select selectMonth=new Select(month);
        selectMonth.selectByValue("1");
        WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select selectDay= new Select(day);
        day.click();
        selectDay.selectByValue("5");
        WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
        year.click();
        Select selectYear= new Select(year);
        selectYear.selectByValue("1985");
        WebElement gender= driver.findElement(By.xpath("//label[text()='Female']"));
        gender.click();
        WebElement signUp= driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        signUp.click();
        Thread.sleep(1000);
        driver.quit();


    }
}
