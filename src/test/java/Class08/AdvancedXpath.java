package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AdvancedXpath extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/advanceXpath.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement textbox=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        textbox.sendKeys("hello");


    }
}
