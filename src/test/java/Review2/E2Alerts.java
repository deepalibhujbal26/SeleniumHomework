package Review2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E2Alerts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");

       //WebElement firstalert  = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        WebElement secondAlert= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        secondAlert.click();

        driver.switchTo().alert().accept();
        //or
     /* Alert alert=  driver.switchTo().alert();
      alert.accept();*/


    }
}
