package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        //go to google.com
        driver.get("https://www.google.com");

        //maximize window
        driver.manage().window().maximize();

        //Slow down the process
        Thread.sleep(2000);

        //goto facebook.com
        driver.navigate().to("https://www.facebook.com");

        //slow down to observe
        Thread.sleep(2000);
        //go back
        driver.navigate().back();

        //slow down to observe
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();

        //slow down to observe
        Thread.sleep(2000);
        //refresh the current webpage
        driver.navigate().refresh();

        //close the current page tab
        driver.close();

        //quit the all page tab
      //  driver.quit();

      /*  driver.get("google.com");
        driver.manage().window().maximize();
        driver.getCurrentUrl();
        driver.getTitle();
        Thread.sleep();
        driver.navigate().to("www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
        driver.close(); */



    }
}
