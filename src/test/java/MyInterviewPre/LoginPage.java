package MyInterviewPre;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {



    WebDriver driver = new ChromeDriver();


    @Test
    public void testLoginFormPresent() {

        //Navigate to given Page
        //verrfiy you are on HomePage
        //Emailid is field is displayed
        //password field is displayed
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        WebElement homeTitlePage = driver.findElement(By.xpath(""));

        WebElement emailId= driver.findElement(By.id("element_id"));
        WebElement password=driver.findElement(By.id("element_id"));
        WebElement loginButton=driver.findElement(By.id("element_id"));
      /*  emailId.isDisplayed();
         password.isDisplayed();
         loginButton.isDisplayed();*/
    }



}
