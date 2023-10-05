package Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
     //   Thread.sleep(2000);

        WebElement element= driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
        if(element.isDisplayed()){
            System.out.println("you are on home page");
        }
        else{
            System.out.println("this is not home page");
        }

        WebElement clickSignIn= driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        clickSignIn.click();

        WebElement verifyNewUser=driver.findElement(By.xpath("//input[@placeholder='Name']"));
        if(verifyNewUser.isDisplayed()){
            System.out.println("Yes its is visible");

            WebElement name= driver.findElement(By.xpath("//input[@placeholder='Name']"));
            name.sendKeys("Pappu");
            WebElement email= driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
            email.sendKeys("pappau@gmailx.com");

            WebElement clickBtn= driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
            clickBtn.click();

            WebElement verifyInfoPage= driver.findElement(By.xpath("//form[@action='/signup']"));
            if(verifyInfoPage.isDisplayed()){
                System.out.println("Yes Page is visible");
                WebElement selectGender= driver.findElement(By.xpath("//input[@id='id_gender2']"));
                selectGender.click();


            }
        }

        else{
            System.out.println("Not Visible");
        }
        driver.quit();
    }
}

