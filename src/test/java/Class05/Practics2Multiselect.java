package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Practics2Multiselect {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");

        WebElement multiselect= driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select mutliclass=new Select(multiselect);

        System.out.println(mutliclass.isMultiple()); //retun true if it is multiple select

        mutliclass.selectByValue("Texas");
        mutliclass.selectByIndex(4);
        mutliclass.selectByVisibleText("New York");

        //deselect
        mutliclass.deselectByIndex(4);

        List<WebElement>mul=mutliclass.getAllSelectedOptions();
        for(WebElement a:mul){
            System.out.println(a.getText());
        }
      /*  List<WebElement>a1=mutliclass.getOptions();
        for(WebElement a: a1){
           a.click();

        }*/


    }

}
