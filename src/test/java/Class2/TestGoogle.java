package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        //enter the text into textbox using id

       WebElement textBoxGoogle= driver.findElement(By.id("APjFqb"));
       textBoxGoogle.sendKeys("What is  Selenium");

       Thread.sleep(2000);

       //click on google Search button
        WebElement googleSearch=driver.findElement(By.name("btnK"));
        googleSearch.click();
        driver.close();
    }
}
