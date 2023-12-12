package MyInterviewPre;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class SearchEngineTest1 {
    WebDriver driver;
    WebElement searchInputField;
    String searchKeyword = "mango nutrition";
    String searchPageGoogleUrl = "https://www.google.com";
    String searchPageBingUrl = "https://www.bing.com";
    String searchInputFieldXpath = "//textarea[@id='APjFqb']|//*[@id='sb_form_q']";
    String searchResultsLinksXpath = "//div[@id='search']//h3|//h2/a";

    @Before
    public void start() {

        driver = new ChromeDriver();
    }

    @After
    public void close() {

        driver.quit();
    }

    @Test
    public void getAndCompareSearchResults() throws InterruptedException {
        //Get Google Search Results
        openSearchResults(searchPageGoogleUrl);
        HashMap<String, String> googleSearchResults = getSearchResults(searchPageGoogleUrl);

        //Wait in between two search results
        Thread.sleep(2000);

        //Get Bing Search Results
        openSearchResults(searchPageBingUrl);
        HashMap<String, String> bingSearchResults = getSearchResults(searchPageBingUrl);

        //Compare Both Results (Comparing Google Vs Google)
        compareTwoHashMapsPrintCommonValues(googleSearchResults, bingSearchResults);
    }


    private void openSearchResults(String searchPageUrl) throws InterruptedException {
        driver.get(searchPageUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(2000);
        searchInputField = driver.findElement(By.xpath(searchInputFieldXpath));
        searchInputField.sendKeys(searchKeyword);
        searchInputField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    private HashMap<String, String> getSearchResults(String searchPageUrl) {
        HashMap<String, String> searchResults = new HashMap<>();
        List<WebElement> searchResultsLinks = driver.findElements(By.xpath(searchResultsLinksXpath));
        for (WebElement searchResultLink : searchResultsLinks) {
            String searchResultTitle = searchResultLink.getText();
            String searchResultUrl = getUrl(searchPageUrl, searchResultLink);

            if (searchResultUrl.length() > 0) {
//                System.out.println("Title " + searchResultTitle);
//                System.out.println("Url " + searchResultUrl);
                searchResults.put(searchResultUrl, searchResultTitle);
            }
        }
        return searchResults;
    }

    private String getUrl(String searchPageUrl, WebElement searchLink) {
        String searchResultUrl = "";
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            if (searchPageUrl.contains("google")) {
                WebElement searchGoogleLink = searchLink.findElement(By.xpath("parent::a"));
                searchResultUrl = searchGoogleLink.getAttribute("href");
            } else {
                searchResultUrl = searchLink.getAttribute("href");
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } catch (Exception e) {
            searchResultUrl = "NO URL AVAILABLE";
        }
        return searchResultUrl;
    }

    private void compareTwoHashMapsPrintCommonValues(HashMap<String, String> searchResult1, HashMap<String, String> searchResult2) {
        System.out.println("Printing common results based on both search results");
        searchResult1.forEach((urlOfSearchResult1, title) -> {
            String urlOfSearchResult2 = searchResult2.getOrDefault(urlOfSearchResult1, "");
            if (urlOfSearchResult2.length() > 0) {
                System.out.println("Url " + urlOfSearchResult1);
                System.out.println();
            }
        });
    }

}
