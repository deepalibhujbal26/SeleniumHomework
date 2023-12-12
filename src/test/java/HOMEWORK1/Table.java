package HOMEWORK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class Table extends CommonMethods {

    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-search-filter-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        try {
            //Extracting all Rows
            List<WebElement> rows = driver.findElements(By.xpath(" //table[@class='table']/tbody/tr"));
            for (WebElement row : rows) {
                System.out.println(row.getText());
            }

            //Extracting  only col with Username
            WebElement table = driver.findElement(By.xpath("//table[@class='table']"));
            WebElement tableHead2 = table.findElement(By.xpath("//thead[2]"));

            List<WebElement> headTitlesRows = tableHead2.findElements(By.xpath("//tr"));
            for (WebElement headTitleRow : headTitlesRows) {
                String headTitleText = headTitleRow.getText();

                System.out.println(headTitleText);
                if (headTitleText.contains("Username")) {
                    List<WebElement> usernameValue = table.findElements(By.xpath("//tbody/tr/td[2]"));
                    for (WebElement a : usernameValue) {
                        System.out.println(a.getText());
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
