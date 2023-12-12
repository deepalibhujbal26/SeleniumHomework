package HOMEWORK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW1ImpilictWait extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-waits.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser); //call this methods from utils packg
        //p[contains(text(),'Hello, this message appeared after you clicked the')]

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            WebElement clickMe1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
            clickMe1.click();

            WebElement labelMsg = driver.findElement(By.xpath("//p[contains(text(),'Hello, this message appeared after you clicked the')]"));
            wait.until(ExpectedConditions.visibilityOf(labelMsg));
            System.out.println(labelMsg.getText());

            //click me to visible the radio btn for m/f
            WebElement clickMe2 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
            clickMe2.click();
            WebElement radioBtnFemale = driver.findElement(By.xpath("//input[@value='Female']"));
            wait.until(ExpectedConditions.visibilityOf(radioBtnFemale));
            radioBtnFemale.click();
            System.out.println("RadioButton Status " + radioBtnFemale.isSelected());

            //Clicke me to checkbox selected

            WebElement clickMe3 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']"));
            clickMe3.click();

            WebElement checkBox2 = driver.findElement(By.xpath("//input[@value='Option-2']"));
            wait.until(ExpectedConditions.visibilityOf(checkBox2));
            checkBox2.click();
            System.out.println("CheckBox2 Options Status " + checkBox2.isSelected());
        } catch (Exception e) {
            System.out.println("Element status" + e);
        }


    }
}
