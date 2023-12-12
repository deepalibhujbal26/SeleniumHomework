package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1Iframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // driver.get("http://35.175.58.98/handle-iframe.php");
        driver.get("http://35.175.58.98/handle-iframe.php");

        //find the iframe where we have to perform some action .
        //her we have to enter the topic in topic element
        //1 switch to iframe then find web element and enter the topic
        driver.switchTo().frame(0);
        WebElement topictxt= driver.findElement(By.xpath("//input[@name='Topic']"));
        topictxt.sendKeys("Hello Selenium");
        //click on the checkbox
        ////using the name or id method
        //here we have to check checkbox frame is it iframe, then what it is inside other frame or
        driver.switchTo().defaultContent() ;
        driver.switchTo().frame("checkbox-iframe");
        WebElement selectcheckbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        selectcheckbox.click();

        //after above opertion my webpointer still point to inside iframe
        //so shift that pointer to default page
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        WebElement selectDrop= driver.findElement(By.xpath("//select[@id='animals']"));

        //we can used select class to find animals
        Select animals=new Select(selectDrop);
        animals.selectByVisibleText("Avatar");








    }
}
