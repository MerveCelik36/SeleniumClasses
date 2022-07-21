package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class AmazonDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.amazon.com/";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement categoriesDD= driver.findElement(By.id("searchDropdownBox"));
        Select select= new Select(categoriesDD);
        List<WebElement> allCategories= select.getOptions();
        int size=allCategories.size();
        System.out.println(size);
        for (WebElement option: allCategories){
            String optionText= option.getText();
            System.out.println(optionText);
        }
        select.selectByValue("search-alias=appliances");
    }
}
