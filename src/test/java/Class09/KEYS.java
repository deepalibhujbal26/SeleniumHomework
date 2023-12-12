package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class KEYS extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://35.175.58.98/keypress.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement input = driver.findElement(By.xpath("//input[@class='form-control']"));
       // input.sendKeys("abc");
       // input.
      //  input.sendKeys(Keys.DELETE);

       input.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        input.sendKeys(Keys.TAB);


    }
}
