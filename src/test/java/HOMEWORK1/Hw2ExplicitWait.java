package HOMEWORK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class Hw2ExplicitWait  extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-explicit-wait.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        try{
            //Alert CLick
            WebElement clickOnAlert=driver.findElement(By.xpath("//button[@id='show_alert']"));
            clickOnAlert.click();
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();

            //click ME change the text
            WebElement clickMebtnText= driver.findElement(By.xpath("//button[@id='changetext_button']"));
            clickMebtnText.click();
            WebElement labelMsg= driver.findElement(By.xpath("//h2[text()='Ssyntaxtechs']"));
            wait.until(ExpectedConditions.visibilityOf(labelMsg));
            String text=labelMsg.getText();
            System.out.println("Waiting to change the text and text is " + text);

            //CLick  to me enable button
            WebElement clickMeToEnablebtn= driver.findElement(By.xpath("//button[@id='display_button']"));
            clickMeToEnablebtn.click();
            WebElement enablebtn=driver.findElement(By.xpath("//button[text()='Enabled']"));
            wait.until(ExpectedConditions.visibilityOf(enablebtn));
            enablebtn.click();

            //Clickmeto selecte the checkBox
            WebElement clickmeCheckBox= driver.findElement(By.xpath("//button[@id='checkbox_button']"));
            clickmeCheckBox.click();
            WebElement checkBox1= driver.findElement(By.xpath("//input[@id='checkbox']"));
            wait.until(ExpectedConditions.elementToBeSelected(checkBox1));
            System.out.println("Check Whether  CheckBox is selected "+ checkBox1.isSelected());






        }catch (Exception e){
            System.out.println(e);
        }

    }
}
