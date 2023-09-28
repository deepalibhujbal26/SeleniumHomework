package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E2RadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");

        //select radio btn
        WebElement radiobtnMale=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        radiobtnMale.click();

        //check radiobtn is seleted or not
       boolean status= radiobtnMale.isSelected();
       if(status){
           System.out.println("Radio btn male was selected");
       }
       else{
           System.out.println("Radio btn male was not selected");
       }
        // check male button is enabled
       boolean btnEnableStatus= radiobtnMale.isEnabled();
        System.out.println("the male radio button is enabled "+ btnEnableStatus);

        //check male button is displayed
         boolean btnDisplayStatus=   radiobtnMale.isDisplayed();
        System.out.println("the male radio button is Displayed " + btnDisplayStatus);

        //age range select from 5-15 most umique for this name attruvit
        List<WebElement> ageRanges=  driver.findElements(By.xpath("//input[@name='ageGroup']"));

        for(WebElement ageRange :ageRanges){
            //get the value of attribute of "value"
           String option= ageRange.getAttribute("value");
           if(option.equalsIgnoreCase("15 - 50")){
              ageRange.click();
           }
        }




    }
}
