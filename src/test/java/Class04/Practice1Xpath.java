package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1Xpath {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");
        WebElement fullNametxt= driver.findElement(By.xpath("//input[@id='userName']"));
        fullNametxt.sendKeys("Deepali Bhujbal");
        WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("abc@gmail.com");

        WebElement currentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("USA");

        Thread.sleep(2000);
        WebElement perAddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        perAddress.sendKeys("India");

        Thread.sleep(2000);
        WebElement btnClick=driver.findElement(By.xpath("//button[@id='submit']"));
        btnClick.click();
        driver.quit();


    }
}
