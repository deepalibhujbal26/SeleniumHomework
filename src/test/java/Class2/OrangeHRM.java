package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRM {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(2000);
        //enter the username as "abc"
        WebElement txtUserName= driver.findElement(By.name("username"));
        txtUserName.sendKeys("abc");

        txtUserName.sendKeys(Keys.COMMAND + "a");
        txtUserName.sendKeys(Keys.DELETE);

//        //enter the username as "Admin
        txtUserName.sendKeys("Admin");

        //enter the password as "admin123
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //get the text on loginButton
        WebElement loginButton=driver.findElement(By.tagName("button"));
        String linkMsg=loginButton.getText();
        System.out.println("The message on link : " + linkMsg);
        loginButton.click();

        driver.quit();



    }
}
