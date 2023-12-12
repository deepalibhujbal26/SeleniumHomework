package MyInterviewPre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Basic {

    public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();

      //  driver.get("http://35.175.58.98/input-form-locator.php");
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        //driver.close();

        String text= driver.findElement(By.xpath("//a[text()='Link']")).getAttribute("button");
        String text1= driver.findElement(By.xpath("//a[text()='Link']")).getText();


        System.out.println(text);


    }
}
