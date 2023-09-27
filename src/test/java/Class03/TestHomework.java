package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestHomework {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        //fullname
        WebElement fullname = driver.findElement(By.xpath("//input[@id='userName']"));
        fullname.sendKeys("abc is my name");

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("abc@gmail.com");

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("USA");

        WebElement permanantAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanantAddress.sendKeys("INDIA");
        Thread.sleep(3000);

        // driver.findElement(By.xpath("//button[@id='submit']")).click();
        //driver.findElement(By.xpath("//button[text()='Submit']")).click();

        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submitButton.click();
    }
}
