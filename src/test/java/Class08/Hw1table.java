package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class Hw1table extends CommonMethods {
    public static void main(String[] args) {

            String url = "http://35.175.58.98/table-pagination-demo.php";
            String browser = "chrome";
            openBrowserAndLaunchApplication(url, browser);

        for (int i = 0; i <3 ; i++) {
            List<WebElement>cols=driver.findElements(By.xpath("//table/tbody/tr/td[7]"));


        }



        }
    }
