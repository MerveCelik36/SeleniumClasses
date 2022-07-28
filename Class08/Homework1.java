package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework1 {
    //go to https://the-internet.herokuapp.com/dynamic_controls
    //click on checkbox and click on remove
    //verify the text
    //click on enable verify the text box is enabled
    //enter text and click disable
    //verify the text box is disabled
    public static void main(String[] args) {
        String url="https://the-internet.herokuapp.com/dynamic_controls";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement aCheckBoxButton= driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement enable= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));

        aCheckBoxButton.click();
        enable.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='swapInput()']")));

        String textForAcheckbox= aCheckBoxButton.getText();
        System.out.println(textForAcheckbox);

        String textForEnable= enable.getText();
     if(textForEnable.equals("Enable")) {
         System.out.println(textForEnable);
     }else{
         System.out.println("Disable");
     }

        boolean disable =aCheckBoxButton.isEnabled();
        boolean disable2=enable.isEnabled();
        System.out.println(disable+ " "+disable2);

    }
}
