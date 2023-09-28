package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWCHECKBOX1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");

        // locate the checkbox1 element
        WebElement checkbox1=driver.findElement(By.xpath("//input[@class='checkbox-field' and @value='Checkbox-1']"));
        //check checkbox1 is enable is = false
        boolean checkStatus= checkbox1.isEnabled();
        System.out.println("CheckBox Status : "+checkStatus);

        //locate element of button enable
       WebElement enablebtn=driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));

      //checkBox1 is condition true means checkbox is disabled the click on enable btn
       if(!checkStatus){
           enablebtn.click();
       }

       // verifiying CHeckbox1 is enabled or not
       boolean checkAgain=checkbox1.isEnabled();
       System.out.println("CHECK Checkbox1 is enabled");
       if(checkAgain){
           checkbox1.click(); // then click on checkBOx1
       }

       //confirm that checkBox1 is selected
        boolean checkAgain1=checkbox1.isSelected();
        if(checkAgain1){
            System.out.println("Check box is selected");
        }
        else{
            System.out.println("check box is not selected");
        }

        Thread.sleep(2500);
        driver.quit();

    }
}
