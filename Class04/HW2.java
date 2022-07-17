package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    //Amazon link count:
    //Open chrome browser
    //Go to “https://www.amazon.com/”
    //Get all links
    //Get number of links that has text
    //Print to console only the links that has text
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Number of elements "+allLinks.size());
        for(WebElement links: allLinks){
            String linkText= links.getText();
            String fullLink=links.getAttribute("href");
            if (!linkText.isEmpty()){
                System.out.println(linkText+ " "+fullLink);
            }

        }
        driver.quit();


    }

}
