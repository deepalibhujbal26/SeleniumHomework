package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW1ClickCheckBox extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser); //call this methods from utils packg

        WebElement checkBoxBbtn=driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBoxBbtn.click();

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement checkBoxSelect= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkbox']")));
        checkBoxSelect.click();



    }
}
