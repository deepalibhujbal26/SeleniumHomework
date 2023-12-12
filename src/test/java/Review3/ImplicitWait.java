package Review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class ImplicitWait  extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-waits.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser); //call this methods from utils packg

        WebElement button2 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        button2.click();

            //implicit wait is already implemented in the comman methods
        //find the radiobutton

        WebElement radioBtn = driver.findElement(By.xpath("//input[@value='Male']"));
        radioBtn.click();




    }
}
