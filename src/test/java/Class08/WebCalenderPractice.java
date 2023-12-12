package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;
import java.util.Set;

public class WebCalenderPractice extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        try {
            //find the username
            WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
            userName.sendKeys("Admin");
            //find the password
            WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
            passWord.sendKeys("Hum@nhrm123");
            //find the login button
            WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
            loginBtn.click();
            //        click on leave
            WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
            leave.click();

            // open the calander first
            WebElement calender = driver.findElement(By.xpath("//input[@id='calFromDate']"));
            calender.click();

            //select the month using select class
            WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select select = new Select(month);
            // select.selectByVisibleText("Aug");
            // System.out.println(month.isSelected());

            //using the loop we can select the month
            List<WebElement> optionsMonth = select.getOptions();
            for (WebElement option : optionsMonth) {
                String text = option.getText();
                if (text.equals("Aug")) {
                    option.click();
                    break;
                }
            }

            //Select the Year  we have to create new Select class object
            WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select selectYear = new Select(year);
            selectYear.selectByVisibleText("2022");


            //Select the date
            List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for (WebElement date :dates){
                String text=date.getText();
                if(text.equals("15")){
                    date.click();
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //driver.quit();
    }
}
