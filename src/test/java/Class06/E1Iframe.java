package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E1Iframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://35.175.58.98/handle-iframe.php");

        //write down the topic
        //switch  to iframe to first frame index 0
        driver.switchTo().frame(0);
         WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("hello");

        //click on the checkbox
        //using the name or id method
        driver.switchTo().frame("checkboxIframe");
        WebElement  checkbox =driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

       //switch to frame and we have to choose animals from droop down
        //switch to default
        driver.switchTo().defaultContent() ;
        //switch to frame using WebElement
       WebElement frameX= driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
         //switch  to frame
        driver.switchTo().frame(frameX);

        WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
        //
        Select sel=new Select(animals);
        sel.selectByVisibleText("Baby Cat");





    }
}
