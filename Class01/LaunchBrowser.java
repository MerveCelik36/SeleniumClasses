package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");// we will get string variable
        String url=driver.getCurrentUrl();// will get our url in the console
        System.out.println(url);
        driver.getTitle();// we will get string variable
        String title=driver.getTitle();// will give title of the url which is google here.
        System.out.println(title);
        driver.quit();// you will quit from browser
    }
}
