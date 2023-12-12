package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E3iframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // driver.get("http://35.175.58.98/handle-iframe.php");
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.switchTo().frame("textfieldIframe");
        WebElement framecheckbox = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(framecheckbox);
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkbox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        WebElement selectDrop= driver.findElement(By.xpath("//select[@id='animals']"));

        //we can used select class to find animals
        Select animals=new Select(selectDrop);
        animals.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");
        WebElement topic=driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("Selenium");




    }
}
