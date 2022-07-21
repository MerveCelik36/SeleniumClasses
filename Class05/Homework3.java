package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework3 {
    //Go to ebay.com
    //get all the categories and print them in the console
    //select Computers/Tables & Networking
    //click on search
    //verify the header
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement allCategories= driver.findElement(By.cssSelector("select#gh-cat"));
        allCategories.click();
        Select select=new Select(allCategories);
        select.selectByValue("58058");
        WebElement search= driver.findElement(By.cssSelector("input#gh-btn"));
        search.click();
        String actualHeader=driver.getTitle();
        String expectedHeader="Computers, Tablets & Network Hardware";
        if (actualHeader.equalsIgnoreCase(expectedHeader)){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is incorrect");
        }

        driver.quit();


    }
}
