package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();

    //enter the username
       WebElement userName= driver.findElement(By.id("txtUsername"));
       userName.sendKeys("Deepali");

        Thread.sleep(2000);

      //Clear the text box and resent the username
       userName.clear();
       userName.sendKeys("Admin");

        //enter the password
      WebElement password= driver.findElement(By.name("txtPassword"));
      password.sendKeys("Hum@nhrm123");

      //click on login button
        WebElement login=driver.findElement(By.className("button"));
        login.click();

        //get the text welcome admin adn print on  the console
        WebElement welcomeMsg=driver.findElement(By.linkText("Welcome Admin"));
        String msg= welcomeMsg.getText();
        System.out.println("The message is here : "+msg);



    }
}
