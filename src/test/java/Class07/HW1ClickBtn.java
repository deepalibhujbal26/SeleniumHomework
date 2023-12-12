package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW1ClickBtn extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser); //call this methods from utils packg

      //  WebElement btnDisplaye= driver.findElement(By.xpath("//button[@id='display_button']"));
     //   btnDisplaye.click();

      /*  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement btnEnable= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Enabled']"))));
       btnEnable.click();

*/     /* By by=By.xpath("//button[@id='display_button']");
        clickElement(by);

         by=By.xpath("//button[text()='Enabled']");
        clickElement(by);
*/
    }
}
