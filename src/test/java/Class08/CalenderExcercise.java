package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class CalenderExcercise  extends CommonMethods {
    public static void main(String[] args) {

        String url="https://www.aa.com/homePage.do?locale=en_US";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


          WebElement buttonClick=driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
            buttonClick.click();

            WebElement month=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            String monthTxt=month.getText();
            boolean status=true;
            while(status)
            if (monthTxt.equalsIgnoreCase("December")){

                List<WebElement>dates=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
                for(WebElement date: dates){
                    String text=date.getText();
                    if(text.equalsIgnoreCase("4")){
                        date.click();
                        status=false;
                        break;
                    }
                }
            }
            if(status){
                WebElement next=driver.findElement(By.xpath("//a[@data-handler='next']"));
                next.click();
            }

    }
}
