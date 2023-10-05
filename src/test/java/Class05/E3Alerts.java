package Class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");

        //Task1 click on  the first alert button snd handle the alert
        WebElement alert1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(2000);
        //switch the focus of the driver to alert
        Alert alert=driver.switchTo().alert();
        alert.accept(); //we can accept this alert so only accept no other options.

            //task2
        //click on the third alert,send some text there and press ok
        WebElement alert3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();
       Thread.sleep(3000);
       // Alert alert2=driver.switchTo().alert(); or we can used alert line no21
        alert.sendKeys("i am human");
        alert.accept();

        WebElement alert2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
         alert2.click();
         Thread.sleep(2000);
        // alert.accept();
         //or accept or dismiss
        alert.dismiss();

    }
}
