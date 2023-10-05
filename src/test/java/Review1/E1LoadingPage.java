package Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1LoadingPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();


        //create new account
       WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
       // boolean status=createNewAccount.isEnabled();
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Deepali");

        System.out.println(driver.getTitle());











    }
}
