package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleLogin {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //click on Sign in Button
        driver.findElement(By.linkText("Sign in")).click();

        WebElement username =driver.findElement(By.id("identifierId"));
        username.sendKeys("abc@gmail.com");

       username.clear();
      username.sendKeys("deepalibhujbal26@gmail.com");


    }
}
