package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingDocuments {

    public static String url = "http://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        // if file name or folder name contains space, try to have them as separate strings and concatenate
        chooseFile.sendKeys("/Users/Syntax/Desktop/SampleTestData.xlsx");
        // windows users might need to use \\
        WebElement uploadButton = driver.findElement(By.id("C://Users//mmerv//IdeaProjects//JavaProgrammingBatch13//Files"));
        uploadButton.click();
    }
}
