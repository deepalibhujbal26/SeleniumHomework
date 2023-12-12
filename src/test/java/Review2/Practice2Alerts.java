package Review2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2Alerts {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
       WebElement btn=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
       btn.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

       WebElement promptBtn =driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptBtn.click();
        alert.sendKeys("selenium");
        alert.accept();

    }
}