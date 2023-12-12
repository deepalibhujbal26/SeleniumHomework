package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW1ExplicitWaits extends CommonMethods {
    /*
    hw1:
http://35.175.58.98/synchronization-explicit-wait.php
click to open alert and handle it
click to change text and get the chnaged text
click to get hidden button click on it
click to get tge checkbox selected and print if it is selected or not
     */
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser); //call these methods from utils package

        WebElement btnclk= driver.findElement(By.xpath("//button[@id='show_alert']"));
        btnclk.click();
        //Here we have to wait until alert is popup
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        //task2
        WebElement clickbtn=driver.findElement(By.xpath("//button[@id='changetext_button']"));
        clickbtn.click();
        WebElement  text1=driver.findElement(By.xpath("//h2[@id='headingtext']"));
        wait.until(ExpectedConditions.textToBePresentInElement(text1,"Ssyntaxtechs"));
        String text=text1.getText();
        System.out.println(text);

        //task3
        WebElement btnDisplaye= driver.findElement(By.xpath("//button[@id='display_button']"));
        btnDisplaye.click();
        WebElement btnEnable= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Enabled']"))));
        btnEnable.click();

        //task4
        WebElement checkBoxBbtn=driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBoxBbtn.click();

        WebElement checkBoxSelect=driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementToBeSelected(checkBoxSelect));
        System.out.println("Check box is Selected Or not  " + checkBoxSelect.isSelected());









    }
}
