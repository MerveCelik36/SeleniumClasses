package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
    public static String url = "https://jqueryui.com/droppable/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        //action.dragAndDrop(draggable, droppable).perform();
        // if more then one action use build and then perform
        // build() will combine all the actions into one
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        //driver.navigate().refresh();

    }
}
