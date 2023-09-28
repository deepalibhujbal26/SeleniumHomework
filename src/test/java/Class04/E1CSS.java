package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1CSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/cssSelector.php");
        //   //input[@id='profileID']

        //fill in profile id
        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("Deepali");

        //fill in the profile name
        WebElement profile = driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("DeepaliPROfile using id #");

        //fill feedback for jenny
        WebElement feedback1 = driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedback1.sendKeys("Using Class attribute with csss");

        //fill feeback for roj
        WebElement feedback2 = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedback2.sendKeys("Using Class attribute with DOT operator");

        //fill the Coure topic
        WebElement content=driver.findElement(By.cssSelector("input[name*='contentInput']"));
        content.sendKeys("Using contains method we used (*) ");

        //using starts with ^ operator
        WebElement  introduction=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introduction.sendKeys("starts with using ^ ");

        //using endswith $ Operator
        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("using end with operator $");


    }

}
