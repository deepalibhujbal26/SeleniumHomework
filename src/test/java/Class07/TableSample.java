package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.sql.SQLOutput;
import java.util.List;

public class TableSample extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/table-data-download-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //get the whole table

        ///*********table level access**************
        WebElement allTable = driver.findElement(By.xpath("//table[@id='example']"));
        String tableContent = allTable.getText();
       // System.out.println(tableContent);

        //********Row level**************
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for (WebElement row : rows) {

            String text = row.getText();
            if(text.contains("Software Engineer")){
                  //   System.out.println(text);
            }
        }

        //**************Column Level Access****************

       List<WebElement> columns= driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
        for(WebElement column :columns){
            String text=column.getText();
           // System.out.println(text);
        }

        //***************Task*******
        //Print the Row with position Software engineer without using contain method
        /* step1 locate the col of position

         */

    List<WebElement> PositionCol=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
        int i=0;
        for (WebElement position: PositionCol){

            String text=position.getText();
            if(text.equalsIgnoreCase("Software Engineer")){
                System.out.println( "Row that contains software engineer "+ i);
           WebElement row=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+(i+1)+"]"));
                System.out.println(row.getText());

            }
            i=i+1;
        }












    }
}
