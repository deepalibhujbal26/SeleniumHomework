package Review3;

import org.openqa.selenium.By;
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


      WebElement clickCheckBoxBtn= driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        clickCheckBoxBtn.click();

        //wait until checkbox is seleted

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
        boolean statusOfCheckBox= driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected();
        System.out.println(statusOfCheckBox);

        //click on the button to change the text

        WebElement changetextbutton= driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changetextbutton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Ssyntaxtechs']")));
        String text= driver.findElement(By.xpath("//h2[text()='Ssyntaxtechs']")).getText();
        System.out.println(text);
    }
}
