package Review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import utils.CommonMethods;

import java.util.List;

public class Table extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-search-filter-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser); //call this methods from utils pack

        //get the column

        List<WebElement> stateuses = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

        // for(WebElement col :cols){}

       /* for (int i = 0; i < stateuses.size(); i++) {
            String currentStatus = stateuses.get(i).getText();
            if (currentStatus.equals("in progress")) {
                System.out.println("The Row number which has in prograss" + i);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + (i + 1) + "]"));
                System.out.println(row.getText());
            }
*/
        //OR with EnhancedLoop
        int i = 1;
        for (WebElement col : stateuses) {
            String text = col.getText();
            if (text.equals("in progress")) {
                // System.out.println("");
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + i + "]"));
                System.out.println(row.getText());
            }
            i++;
        }


    }

}


