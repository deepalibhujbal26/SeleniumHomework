package Class08;

import Class09.ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class HWWebCalender extends CommonMethods {
    public static void main(String[] args) {

        /*
        list all month t
        if condition check month =Dec
        the click on next
        then break
         */

        String url = "https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        try {
            //click on textbox to open the Calender

          //  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
            //OR
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

            WebElement textBoxDate = driver.findElement(By.xpath("//input[@id='datepicker']"));
            textBoxDate.click();

            WebElement CurrentMonth = driver.findElement(By.className("ui-datepicker-month"));
            String textMonth = CurrentMonth.getText();
            System.out.println(textMonth);

            WebElement CurrentYear = driver.findElement(By.className("ui-datepicker-year"));
            String textYear = CurrentYear.getText();
            System.out.println(textYear);

            boolean status = true;
            while (status) {

                List<WebElement> allMonth = driver.findElements(By.className("ui-datepicker-month"));

                List<WebElement> allYear = driver.findElements(By.className("ui-datepicker-year"));

                for (WebElement month : allMonth) {
                    String monthTxt = month.getText();
                    for (WebElement year : allYear) {
                        String yearTxt = year.getText();

                        if (monthTxt.equalsIgnoreCase("December") && yearTxt.equalsIgnoreCase("1998")) {
                            status = false;
                            break;
                        } else if (status) {
                            WebElement prev = driver.findElement(By.xpath("//span[text()='Prev']"));
                            prev.click();
                        }
                    }
                }
            }
            List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for(WebElement date :dates){
                String  string=date.getText();
                if(string.equalsIgnoreCase("5")){
                    date.click();
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
