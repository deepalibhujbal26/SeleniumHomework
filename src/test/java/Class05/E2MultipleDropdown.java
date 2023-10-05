package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2MultipleDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");

        WebElement dd= driver.findElement(By.xpath("//Select[@id='multi-select']"));
      //Create object an select class
        Select sel=new Select(dd);
        //select texax option by visible text
        sel.selectByVisibleText("Texas");
        //select the value of attribute using value
        sel.selectByValue("Florida");
        Thread.sleep(2000);
        //deselect
        sel.deselectByVisibleText("Texas");

        //check whether the dropdown is multiselect or not
        System.out.println(sel.isMultiple());











    }
}
