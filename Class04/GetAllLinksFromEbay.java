package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.findElements(By.tagName("a"));
        List<WebElement> allLink=driver.findElements(By.tagName("a"));
        System.out.println("Number of links "+ allLink.size());// we found here how many links we have
        for(WebElement print:allLink){ //we will print out the all links here
           String linkText = print.getText();
           if (!linkText.isEmpty()){
               System.out.println(linkText );
           }
        }//if we want to print also full link;
        for(WebElement print:allLink){ //we will print out the all links here
            String linkText = print.getText();
            String fullLink= print.getAttribute("href");
            if (!linkText.isEmpty()) {
                System.out.println(linkText + "    " + fullLink);


            }}
    }
}
