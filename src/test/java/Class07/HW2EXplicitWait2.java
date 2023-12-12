package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW2EXplicitWait2  extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-waits.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser); //call these methods from utils package
        WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(20));

        //clickme1
        WebElement clickMeBtn1= driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        clickMeBtn1.click();
        WebElement text= driver.findElement(By.xpath("//p[contains(text(),'Hello, this message appeared after you clicked the')]"));
        System.out.println(text.getText());








    }
}
