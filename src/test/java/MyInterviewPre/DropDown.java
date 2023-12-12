package MyInterviewPre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        Select select=new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
        select.selectByVisibleText("Monday");
        select.selectByIndex(2);
        select.selectByValue("Monday");


        //div[@data-toggle='dropdown']
    }
}
