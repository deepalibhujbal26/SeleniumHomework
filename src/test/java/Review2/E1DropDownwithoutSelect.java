package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E1DropDownwithoutSelect {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");

        WebElement btnSelectDestination= driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        btnSelectDestination.click();
        //we can go through the loop to select option                           this parent/child path
      List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for(WebElement option :options){
          String text= option.getText();
          if(text.equals("Peru")){
              option.click();
              break;

          }
        }
    }
}
