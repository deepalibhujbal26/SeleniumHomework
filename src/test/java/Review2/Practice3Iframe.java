package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice3Iframe {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/handle-iframe.php");

       driver.switchTo().frame("textfieldIframe");
       driver.switchTo().frame("checkboxIframe");

     WebElement checkbox= driver.findElement(By.xpath("//input[@class='cb1-element']"));
     checkbox.click();

     driver.switchTo().defaultContent();
     driver.switchTo().frame("dropdownIframe");
     WebElement selectoption =driver.findElement(By.xpath("//select[@id='animals']"));
     selectoption.click();
     Select select=new Select(selectoption);
     select.selectByValue("big baby cat");

     driver.switchTo().defaultContent();
     driver.switchTo().frame("textfieldIframe");
     WebElement txtTopic=driver.findElement(By.xpath("//input[@name='Topic']"));
     txtTopic.sendKeys("Selenium");



    }
}
