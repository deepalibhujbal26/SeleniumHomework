package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PracticeDropDownWithoutSelect {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");

       WebElement btnclk  = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        btnclk.click();
        // i want to select the dropdown to travser thruogh the elemenet

        List<WebElement>allOption=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for(WebElement option: allOption){
            String text=option.getText();
            if(text.equals("Peru")){
                option.click();
                break;
            }
        }

    }
}
