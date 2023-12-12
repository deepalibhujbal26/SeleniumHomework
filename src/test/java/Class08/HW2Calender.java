package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW2Calender extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);


        try {
            // Locate the date input field and click to open the calendar
           // WebElement dateInput = driver.findElement(By.id("datepicker"));


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("datepicker")));
            dateInput.click();


            // Select December 1998 in the calendar
            WebElement selectMonthYear = driver.findElement(By.className("ui-datepicker-title"));
            selectMonthYear.click();
            Select selectMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
            selectMonth.selectByVisibleText("Dec");
            Select selectYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
            selectYear.selectByVisibleText("1998");

            // Locate and click on the 5th day
            WebElement fifthDay = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='5']"));
            fifthDay.click();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}





