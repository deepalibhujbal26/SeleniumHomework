package Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        //check all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement checkbox : checkboxes) {
            String option = checkbox.getAttribute("value");
            if (option.equalsIgnoreCase("Checkbox-1")) {
                boolean state = checkbox.isEnabled();
                System.out.println(state);
                //If Checkbox1 is disabled:
                //Click on the "enable checkboxes" button.

                if(!state){
                WebElement enableBtn=    driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                enableBtn.click();
                //// verifiying CHeckbox1 is enabled or not
                    boolean status2=checkbox.isSelected();
                    if(status2){
                        checkbox.click();
                        //confirm checkbbox1 is selected
                        boolean isseletedStatus=checkbox.isSelected();
                        System.out.println(isseletedStatus);
                    }

                }



            }
        }

    }
}
