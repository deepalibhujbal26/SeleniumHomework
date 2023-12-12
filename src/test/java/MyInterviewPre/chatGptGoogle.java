package MyInterviewPre;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class chatGptGoogle {


    public static void main(String[] args) {

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        WebElement searchInputField;
        WebElement clickOnSearchButton;

        // Navigate to Google
        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        searchInputField=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        searchInputField.sendKeys("Syntax");
        clickOnSearchButton=driver.findElement(By.name("btnK"));
        clickOnSearchButton.click();

        // Extract search results
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div.g"));

        // Store results in a HashMap
        HashMap<Integer, HashMap<String, String>> resultsMap = new HashMap<>();
        for (int i = 0; i < searchResults.size(); i++) {
            WebElement result = searchResults.get(i);
            String title = result.findElement(By.cssSelector("h3")).getText();
            String link = result.findElement(By.cssSelector("a")).getAttribute("href");
            String shortDescription=result.findElement(By.xpath("//span//em[text()='Syntax']")).getText();

            HashMap<String, String> resultInfo = new HashMap<>();
            resultInfo.put("title", title);
            resultInfo.put("link", link);
            resultInfo.put("shortDescription",shortDescription);

            resultsMap.put(i + 1, resultInfo);
        }

        // Close the WebDriver
        driver.quit();

        // Print the results
        for (int index : resultsMap.keySet()) {
            HashMap<String, String> result = resultsMap.get(index);
            System.out.println(index + ". " + result.get("title") + " - " + result.get("link"));
            System.out.println(result.get("shortDescription"));
        }
    }
}


