package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        //declare the instance of Webdriver
        WebDriver driver=new ChromeDriver();

        //use the driver.get method
        driver.get("https://www.google.com");

        //Maximize your window
        driver.manage().window().maximize();

        //get the url of the website
        String currentUrl =driver.getCurrentUrl();
        System.out.println("The current url is : "+currentUrl);

        //get the title
       String title = driver.getTitle();
        System.out.println("Title of page is :"+title);

        //added a wait for 2 seconds to slow the closing of window
        //delete thee sleep after you are done wtih scirpt
        Thread.sleep(2000);

        //close the browser
        driver.quit();







    }
}
