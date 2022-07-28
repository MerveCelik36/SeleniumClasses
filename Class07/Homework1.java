package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FilterOutputStream;
import java.util.Iterator;
import java.util.Set;

public class Homework1 {
    //Go to https://demoqa.com/browser-windows
    //click on New Tab and print the text from new tab in the console
    //click on New Window and print the text from new window in the console
    //click on New Window Message and print the text from new window in the console
    //Verify (compare) the titles for each page
    //Print out the title of the all pages
    public static void main(String[] args) {
        String url= "https://demoqa.com/browser-windows";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String mainHandle= driver.getWindowHandle();
        System.out.println(mainHandle);

        WebElement newTabButton= driver.findElement(By.id("tabButton"));
        WebElement newWindowButton= driver.findElement(By.id("windowButton"));
        WebElement newWindowMessageButton= driver.findElement(By.id("messageWindowButton"));

        newTabButton.click();
        newTabButton.click();
        newWindowMessageButton.click();

        Set<String> allWindowHandles= driver.getWindowHandles();
        int numberOfWindows= allWindowHandles.size();
        System.out.println(numberOfWindows);

        Iterator<String> it= allWindowHandles.iterator();
        mainHandle=it.next();
        String secondHandle= it.next();
        String thirdHandle= it.next();
        String fourthHandle= it.next();
        System.out.println(secondHandle);
        System.out.println(thirdHandle);
        System.out.println(fourthHandle);


        }




    }

