package MyInterviewPre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Radiobutton {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement radiobtnMale=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        radiobtnMale.click();
        System.out.println(radiobtnMale.isSelected());

        WebElement femaleRadiobtn=driver.findElement(By.xpath("//input[@name='gender-identity' and @value='gender-female']"));
        femaleRadiobtn.click();

        List<WebElement> radiobtns=driver.findElements(By.name("sex"));
        for (WebElement radiobtn: radiobtns){
            String text= radiobtnMale.getText();

        }

        driver.close();
    }
}
