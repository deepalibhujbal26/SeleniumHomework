package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice1Dropdwon {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        WebElement dropdown= driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select dropdownclass=new Select(dropdown);
        dropdownclass.selectByVisibleText("Monday");

        dropdownclass.selectByValue("Tuesday");
        dropdownclass.selectByIndex(4);

    }
}
