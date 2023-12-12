package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class HW1RadioBtn extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-waits.php";

        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement btnclk =driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
                btnclk.click();








    }
}
