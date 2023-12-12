package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropDown1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");

       WebElement selectTag = driver.findElement(By.xpath("//select[@id='select-demo']"));
       selectTag.click();
       //Select class can be created

        Select select=new Select(selectTag);
        select.selectByVisibleText("Sunday");
        select.selectByIndex(4);
        select.selectByValue("Friday");
    }
}
