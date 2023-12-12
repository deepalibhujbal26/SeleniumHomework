package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class ExplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser); //call this methods from utils packg

        WebElement enablebtn=driver.findElement(By.xpath("//button[@id='enable_button']"));
        enablebtn.click();

        //as the button takes some time to be clickable
        //i will wait until it is clickable using explicit wait

        WebDriverWait  wait=new WebDriverWait(driver, Duration.ofSeconds(20));

       // wait.until(ExpectedConditions.alertIsPresent());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));


       // wait.until(ExpectedConditions.t)
        //wait is over Button is enable so we can click on
        WebElement btnclk=driver.findElement(By.xpath("//button[text()='Button']"));
        btnclk.click();


    }
}
