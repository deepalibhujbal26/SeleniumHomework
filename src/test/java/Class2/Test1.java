package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //enter the username as "abc"
        WebElement txtUserName= driver.findElement(By.name("username"));
        txtUserName.sendKeys("abc");
//
//        //clear the text
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.name("username")).getAttribute("value"));

        while(!driver.findElement(By.name("username")).getAttribute("value").isEmpty()){
            txtUserName.sendKeys(Keys.BACK_SPACE);
        }

        Thread.sleep(2000);
        //txtUserName.clear();
//
//        //enter the username as "Admin
        txtUserName.sendKeys("Admin");

        //enter the password as "admin123
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //get the text on loginButton
        WebElement loginButton=driver.findElement(By.className("orangehrm-login-button"));
        String linkMsg=loginButton.getText();
        System.out.println("The message on link : " + linkMsg);
        loginButton.click();

        driver.quit();



    }
}
