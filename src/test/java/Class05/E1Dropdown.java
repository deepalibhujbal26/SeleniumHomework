package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E1Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");

        //find the dropdown or locate single element from dropdwon
        WebElement dropdown= driver.findElement(By.xpath("//Select[@id='select-demo']"));

        //Create the object of select class
        Select sel=new Select(dropdown);
            //used any method out of index(), visibleText(),byValue() select your desired option
        sel.selectByVisibleText("Friday");
        Thread.sleep(3000);
        //select the value of attribute using selectByValue
       sel.selectByValue("Tuesday");

       //select the value of attribute using index
        sel.selectByIndex(2);  //index value of Monday is 2

      /*  List<WebElement>options=  sel.getOptions();
        for(WebElement option: options){
            System.out.println(option.getText());
            option.click(); //if i want select on all the options
        }
*/

    }
}
