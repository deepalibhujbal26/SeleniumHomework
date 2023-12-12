package Class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        //Javascirpt based Alerts we can accept ,dismiss,getText(),sendKeys()

      //  WebElement slert1= driver.findElement(By.xpath());
     WebElement firstalert  = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
     firstalert.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        //or we can reject
       // alert.dismiss();
        WebElement secondAlert= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        secondAlert.click();
        Thread.sleep(3000);
        //we can direclty used alert object here .,it defined above
        alert.dismiss();

        WebElement thirdAlert=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        thirdAlert.click();
        Thread.sleep(3000);
        alert.sendKeys("deepali");
        alert.accept();







    }
}
