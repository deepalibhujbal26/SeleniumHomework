package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E3CheckBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();
        //if it is selected after click
        boolean selectState = checkBox1.isSelected();
        if (selectState) {
            System.out.println("the checkbox is selected");
        } else {
            System.out.println("the checkbox isnt selected");
        }

        //select all option
         List<WebElement> checkBoxs=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement checkbox: checkBoxs){
            checkbox.click();
        }

        //deselected option 3 of check box aga
            for(WebElement checkBoxAgain : checkBoxs){
                //get value of attribute "value"
                 String option =checkBoxAgain.getAttribute("value");

                 if(option.equalsIgnoreCase("Option-3")){
                     checkBoxAgain.click();
                 }

            }

    }
}