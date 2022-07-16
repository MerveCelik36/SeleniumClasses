package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Recap {
    public static void main(String[] args) {


    System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe" ); // set the property first. takes 2 argument

        WebDriver driver= new FirefoxDriver();// create an object to launch the browser
          driver.get("https://www.google.com/");
          driver.manage().window().maximize();// maximizing the web browser
          String title = driver.getTitle();// this is the actual title (baslik). sadece biraz renk katalim diye
       // yeni bir  obje olusturduk ve bunu bizim driver.getTittle() methoduna esitleyip if else yaptik.
          String expectedTitle= "Google";
          if (title.equalsIgnoreCase(expectedTitle)){
              System.out.println("Title is correct");
          }else{
              System.out.println("Title is incorrect");
          }

         driver.quit();//browseri kapattik.
    }
}
