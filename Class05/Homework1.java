package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework1 {
    //Facebook dropdown verification
    //Open chrome browser
    //Go to “https://www.facebook.com”
    //click on create new account
    //Verify:
    //month dd has 12 month options
    //day dd has 31 day options
    //year dd has 115 year options
    //Select your date of birth
    //Quit browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);

       //Verifying months
        WebElement monthElements= driver.findElement(By.id("month"));
        Select selectMonth=new Select(monthElements);
        selectMonth.selectByValue("5");
        List<WebElement> allMonths= selectMonth.getOptions();
        int sizeOfMonth= allMonths.size();
        if (sizeOfMonth==12){
        System.out.println("There are "+sizeOfMonth+" month on the list");}

       //Verifying days
        WebElement dayElements= driver.findElement(By.id("day"));
        Select selectDays=new Select(dayElements);
        selectDays.selectByValue("20");
        Thread.sleep(2000);
        List<WebElement> allDays= selectDays.getOptions();
        int sizeOfDays= allDays.size();
        if (sizeOfDays==31){
        System.out.println("There are "+sizeOfDays+" days on the list");}

        //Verifying year
        WebElement yearElements= driver.findElement(By.id("year"));
        Select selectYears=new Select(yearElements);
        selectYears.selectByValue("1994");
        Thread.sleep(2000);
        List<WebElement> allYears= selectYears.getOptions();
        int sizeOfYears= allYears.size();
        if(sizeOfYears==118){
        System.out.println("There are "+sizeOfYears+" years on the list");}

    }
}
