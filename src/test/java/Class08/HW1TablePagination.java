package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class HW1TablePagination extends CommonMethods {
    /*
    HW1:
goto http://35.175.58.98/table-pagination-demo.php
print all the rows with remarks pass
remember to print rows from all pages of tables

     */
    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-pagination-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        List<WebElement> totalPageLinks = driver.findElements(By.xpath("//a[contains(@class,'page_link')]"));
        int totalPagesCount = totalPageLinks.size();
        int i = 0;
        do {
            List<WebElement> totalRows = driver.findElements(By.xpath("//table/tbody[@id='myTable']/tr"));
            totalRows.stream().forEach(currentRow -> {
                WebElement remarksColumn = currentRow.findElement(By.xpath("td[7]")); // remark column
                String remarksColumnText = remarksColumn.getText();
                if (remarksColumnText.equals("Pass")) {
                    System.out.println(currentRow.getText());
                }
            });
            i++;

            if (i < totalPagesCount) {
                totalPageLinks.get(i).click();
            }
        } while(i < totalPagesCount);

        driver.quit();
    }

}
