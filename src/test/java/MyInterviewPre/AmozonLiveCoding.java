package MyInterviewPre;

import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmozonLiveCoding {

    //Navigate to www.amozon.com
    //click on Menu on left hand side corner
    //click on see all under shop by deparment tab
    //then click on Electronics
    //then under Tv & video
    //click on Television link
    //scroll down
    //select the checkbox Samsung under the "featured brand"
    //click on sort list  right hand side
    //click on High to low option in sort list
    //click on 2nd click to view second list item disaplye
    //locate the "about this item " and print the Result

    WebDriver driver;
    String getUrl = "https://www.amazon.com";

    @Before
    public void openBrowser() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get(getUrl);
        Thread.sleep(30000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    private void clickElement(String xpath) throws Exception {
        System.out.println("About to click on element with xpath "+ xpath);
        WebElement element = driver.findElement(By.xpath(xpath));
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            System.out.println("Successfully clicked");
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();", element);
            System.out.println("Successfully clicked using javascript");
        }
        Thread.sleep(2000);
    }

    private void getText(String xpath) throws InterruptedException {
        System.out.println("About to get text of element with xpath "+ xpath);
        WebElement element = driver.findElement(By.xpath(xpath));
        String text = element.getText();
        System.out.println("Received text" + text);
        Thread.sleep(1000);
    }

    @Test
    public void findTheSecondHighPriceSamsungTVAmazon() throws Exception {
        String hamburgerMenuXpath = "//a[@id='nav-hamburger-menu']";
        String seeAllInDepartmentXpath = "//ul[@class='hmenu hmenu-visible']//li[22]//a[1]";
        String electronicsXpath = "//a[@class='hmenu-item']/div[text()='Electronics']";

        String tvVideoXpathChanged = "//a[text()='TV & Video']";
        String televisionXpath = "//a[contains(text(),'Televisions')]";
        String checkBoxSamsungXpath = "//input[@id='apb-browse-refinements-checkbox_103']";
        String sortByXpath = "//span[@class='a-dropdown-container']";
        String highToLowSortXpath = "//a[@id='s-result-sort-select_2']";
        String secondHighPriceTvXpath = "(//div[@class='a-section a-spacing-base'])[2]";
        String aboutThisItemXpath = "//div[@id='featurebullets_feature_div']";

        clickElement(hamburgerMenuXpath);
        clickElement(seeAllInDepartmentXpath);
        clickElement(electronicsXpath);
        clickElement(tvVideoXpathChanged);
        //clickElement(televisionXpath);
        driver.findElement(By.linkText("Televisions")).click();
        clickElement(checkBoxSamsungXpath);
        clickElement(sortByXpath);
        clickElement(highToLowSortXpath);
        clickElement(secondHighPriceTvXpath);
        getText(aboutThisItemXpath);
    }

    @After
    public void closeBrowser() {
        driver.close();
    }
}
