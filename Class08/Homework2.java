package Class08;

import Utils.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    //create a package and name it as utils
    //create a class and name as CommonMethods
    //create functions (methods) to open and quit the browsers
    //open method has to accept a url as a parameter
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        CommonMethods.openBrowser(driver,"https://google.com/");
        CommonMethods.quitBrowser(driver);
    }
}
