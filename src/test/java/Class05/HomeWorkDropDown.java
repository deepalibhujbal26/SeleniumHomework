package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkDropDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");

        WebElement btnSelectDestination= driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        btnSelectDestination.click();

        WebElement frenchSelect= driver.findElement(By.xpath("//a[text()='French Polynesia']"));
        frenchSelect.click();








    }
}
