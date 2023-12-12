package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW1ChangeeText extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser); //call this methods from utils packg

        //***click to change text and get the changed text***

        WebElement clickbtn=driver.findElement(By.xpath("//button[@id='changetext_button']"));
        clickbtn.click();


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement  text1=driver.findElement(By.xpath("//h2[@id='headingtext']"));
        wait.until(ExpectedConditions.visibilityOf(text1));

        String text= text1.getText();
        System.out.println(text);



    }
}
