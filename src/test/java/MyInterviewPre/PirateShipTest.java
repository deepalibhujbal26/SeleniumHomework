package MyInterviewPre;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PirateShipTest {
    WebDriver driver;
    WebElement queryInputField;
    WebElement submitButton;

    @Before
    public void open() {
        driver = new ChromeDriver();
        //Navigate to Given URL
        driver.get("");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

        queryInputField = driver.findElement(By.id("search-input"));
        submitButton = driver.findElement(By.id("search-button"));
    }

    @After
    public void close() {
        driver.close();

    }

    @Test
    public void testLoginPageTile() {
        boolean isQueryInputFieldDisplayed = queryInputField.isDisplayed();
        boolean isSubmitButtonDisplayed = submitButton.isDisplayed();
        Assert.assertTrue("Query Input field is not displayed", isQueryInputFieldDisplayed);
        Assert.assertTrue("Submit Button is not displayed", isSubmitButtonDisplayed);

    }

    @Test
    public void testQueryFieldIsEmpty() {
        queryInputField.sendKeys("");
        submitButton.click();
        WebElement errorMessageField = driver.findElement(By.id("error-empty-query"));
        String actualErrorMessage = errorMessageField.getText();
        Assert.assertEquals("Empty Query", actualErrorMessage);

    }

    @Test
    public void testQuerySearchResult() {
        queryInputField.sendKeys("isla");
        submitButton.click();
        //There should be at least one <li>result element
        List<WebElement> searchResults = driver.findElements(By.tagName("li"));
        boolean isResultDisplayed = false;
        if (searchResults.size() > 0) {
            isResultDisplayed = true;
        }
        Assert.assertTrue("Search Result is not displayed", isResultDisplayed);

    }

    @Test
    public void testFeedbackForNoResult() {
        queryInputField.sendKeys("castle");
        submitButton.click();
        WebElement feedbackField = driver.findElement(By.id("error-np-results"));
        String feedbackFieldText = feedbackField.getText();
        Assert.assertEquals("It is displaying the result of castle input", feedbackFieldText);

    }

    @Test
    public void testResultMatchQuery() {
        queryInputField.sendKeys("port");
        submitButton.click();
        //Output will Return as "Port Royal"
        List<WebElement> searchResults = driver.findElements(By.tagName("li"));
        boolean isResultDisplayed = false;
        if (searchResults.size() == 1) {
            isResultDisplayed = true;
        }
        Assert.assertTrue("More than one Search Result is displayed", isResultDisplayed);
        Assert.assertEquals("Port Royal is not displayed",searchResults.get(0).getText().equals("Port Royal"));

    }

}
