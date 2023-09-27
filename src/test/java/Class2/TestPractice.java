package Class2;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class TestPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
     //   driver.get("https://syntaxprojects.com/");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);

        WebElement userName=driver.findElement(By.name("username"));
        userName.sendKeys("abc");

        Thread.sleep(2000);
        //userName.clear();
        userName.sendKeys(Keys.COMMAND+"a");
        userName.sendKeys(Keys.DELETE);

        Thread.sleep(2000);

       userName.sendKeys("Admin");

       WebElement password=driver.findElement(By.name("password"));
       password.sendKeys("admin123");


        Thread.sleep(2000);
       WebElement login=driver.findElement(By.tagName("button"));

       String urlText=login.getText();
        System.out.println("Text of Login Button "+urlText);
       login.click();






    }
}
