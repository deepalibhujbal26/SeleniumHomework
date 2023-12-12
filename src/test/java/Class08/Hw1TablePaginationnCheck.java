package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class Hw1TablePaginationnCheck extends CommonMethods {
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

        try {

            List<WebElement> noOfPages = driver.findElements(By.xpath("//a[contains(@class,'page_link')]"));

            System.out.println("Number of pages " + noOfPages.size());
            for (int j = 0; j < noOfPages.size(); j++) {
                List<WebElement> cols = driver.findElements(By.xpath("//table/tbody[@id='myTable']/tr/td[7]"));
                for (int i = 0; i < cols.size(); i++) {

                    String text = cols.get(i).getText();
                    if (text.equals("Pass")) {
                        System.out.println(text);
                        WebElement row = driver.findElement(By.xpath("//table/tbody[@id='myTable']/tr[" + (i + 1) + "]"));
                        System.out.println(row.getText());
                    }
                }

          //   WebElement  nextPage =driver.findElement(By.xpath("//a[@class='next_link']"));

                //  noOfPages.get(j + 1).click();
                if (j != noOfPages.size()) {
                    noOfPages.get(j + 1).click();
                }

            }
        } catch (Exception e) {
            System.out.println("Not able to locate the element");
        }
        driver.quit();
    }

}
