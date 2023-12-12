package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class HW3table  extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/table-search-filter-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

       // WebElement alltable= driver.findElement(By.xpath(""));

        List<WebElement>rows= driver.findElements(By.xpath("//table[@id='task-table']//tbody//tr"));
        for(WebElement row :rows){

            String text=row.getText();
            if(text.contains("in progress")){
               // System.out.println(row.getText());
            }
        }

        //Without contain method

        List<WebElement>cols=driver.findElements(By.xpath("//table[@id='task-table']//tbody//tr//td[4]"));
        int i=0;
        for(WebElement col :cols){
            String text= col.getText();
            if(text.equalsIgnoreCase("in progress")){

                System.out.println("Row contains In progress words "+i);

               // WebElement row=driver.findElement(By.xpath("driver.findElements(By.xpath(//table[@id='task-table']//tbody//tr["+(i+1)+"]"));
                WebElement row=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+(i+1)+"]"));
                System.out.println(row.getText());
            }
            i=i+1;
        }

    }
}
