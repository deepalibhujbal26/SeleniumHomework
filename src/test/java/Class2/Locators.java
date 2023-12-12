package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/input-form-locator.php");

        //Maximize the window
        driver.manage().window().maximize();

        //locate the webElement firstname
        WebElement firstName= driver.findElement(By.id("first_name"));
        firstName.sendKeys("Deepali");

        //locate the webelement lastname
        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("Bhujbal");

       //Locate the email
      WebElement email= driver.findElement(By.className("form-control-01"));
      email.sendKeys("abc@gmail.com");

      //locate the button and click
        WebElement submitBtn=driver.findElement(By.tagName("button"));
        submitBtn.click();

        //locate the webelement link
       WebElement link = driver.findElement(By.linkText("Link"));
       link.click();

       //locate the element click using partial link text
        WebElement clickhere =driver.findElement(By.partialLinkText(" Here."));
        clickhere.click();









    }
}
