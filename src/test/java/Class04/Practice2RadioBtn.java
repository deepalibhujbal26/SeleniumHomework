package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2RadioBtn {
    public static void main(String[] args) throws InterruptedException {
        // public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");

        WebElement radiobtnYes = driver.findElement(By.xpath("//input[@name='optradio' and @value='Female']"));
        radiobtnYes.click();
        boolean statusRadiobtn = radiobtnYes.isSelected();
        System.out.println(statusRadiobtn);

        WebElement radiobtnFemale = driver.findElement(By.xpath("//input[@name='gender-identity' and @value='gender-female']"));
        boolean femalRadioBtnStatus = radiobtnYes.isEnabled();
        System.out.println("Status of Radio btn " + femalRadioBtnStatus);
        Thread.sleep(2000);
        WebElement btnEnable = driver.findElement(By.xpath("//button[@id='enabledradio']"));
        if (femalRadioBtnStatus) {
            btnEnable.click();
        }
        boolean femalbtnSelected=radiobtnYes.isEnabled();
        System.out.println(femalbtnSelected);
    }
}
