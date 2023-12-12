package MyInterviewPre;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.*;
import java.util.List;
public class SearchEngineTest {

    //Task Automate the 2 search Engine

    /*
    task 1 Search on Google
    Step1 : WebDriver create object of chromeDriver
    step2 : navigate to google.com
    step3 : locate the textInputField for search and Enter <Keyword> to search (10 search item)
    step5 : click on search button
    step6: store the search Result in Hash/arraylist/map Data structure
    step7 : Make sure that search result should at least contain the <Keyword>text
    step8Repeat : repeat the step 2 to step 7  for another search engine
    step 8 : compare the result with another search engine the Result
     *
     //div[@id='search']//h3/parent::a/parent::span/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div
     */

    WebDriver driver = new FirefoxDriver();
    WebElement searchInputField;
    String searchKeyword = "Tylenol";
    String yahooSearchURL = "https://www.yahoo.com";
    String duckDuckGoSearchURL = "https://duckduckgo.com";
    String inputFieldXpathYahoo = "//input[@id='ybar-sbq']";
    String inputFieldXpathDuckDuckGo = "//input[@id='searchbox_input']";
    String searchResultXpathYahoo = "//a[contains(text(), 'TYLENOL')]|//a[contains(text(), 'Tylenol')]";
    String searchResultXpathDuckDuckGo = "//h2/a";


    public void start(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void inputField(String inputXpath) throws InterruptedException {
        searchInputField = driver.findElement(By.xpath(inputXpath));
        searchInputField.sendKeys(searchKeyword);
        Thread.sleep(1000);
        searchInputField.sendKeys(Keys.ENTER);
    }

    private HashMap<String, String> getSearchResults(String searchResultXpath) {
        HashMap<String, String> searchResults = new HashMap<>();
        List<WebElement> searchResultsElements = driver.findElements(By.xpath(searchResultXpath));
        for (WebElement searchResult : searchResultsElements) {
            String title = searchResult.getText();
            String url = searchResult.getAttribute("href");
            searchResults.put(url, title);
        }
        return searchResults;
    }

    public void compareHashMapURL(Map<String, String> yahooMap, Map<String, String> duckDuckGoMap) {
        //compare to 2 hash map
        yahooMap.forEach((key, value) -> {
            if (duckDuckGoMap.getOrDefault(key, "").length() > 0) {
                System.out.println(key);
            }
        });

    }

    @After
    public void close() {
        driver.close();
    }

    @Test
    public void searchKeyword() throws InterruptedException {
        start(yahooSearchURL);

        inputField(inputFieldXpathYahoo);
        Thread.sleep(2000);
        Map<String, String> yahooSearchData = getSearchResults(searchResultXpathYahoo);
        Thread.sleep(2000);
        start(duckDuckGoSearchURL);
        inputField(inputFieldXpathDuckDuckGo);
        Thread.sleep(2000);
        Map<String, String> duckDuckGoSearchData = getSearchResults(searchResultXpathDuckDuckGo);
        Thread.sleep(2000);
        compareHashMapURL(yahooSearchData, duckDuckGoSearchData);

    }






   /* @Test
    public void searchTitleYahoo() {
        searchResults = driver.findElements(By.xpath("//a[contains(text(), 'TYLENOL')]|//a[contains(text(), 'Tylenol')]"));

        Map<String, String> titleURlResultMap = new HashMap<>();
        for (WebElement searchResult : searchResults) {
            String title = searchResult.getText();
            String url = searchResult.getAttribute("href");
            System.out.println("title  : " + title);
            System.out.println("url : " + url);
            titleURlResultMap.put(url, title);
        }
        for (Map.Entry<String, String> entry : titleURlResultMap.entrySet()) {
            System.out.println("url " + entry.getKey());
            System.out.println("title " + entry.getValue());
            System.out.println();
        }
    }*/

  /*  @Test
    public void searchTitleDuckDuckGo() {

        driver = new FirefoxDriver();
        driver.get("");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        searchInputField = driver.findElement(By.xpath(""));
        searchInputField.sendKeys(searchKeyword);
        searchInputField.sendKeys(Keys.ENTER);

        searchResults = driver.findElements(By.xpath("//h2/a"));

        Map<String, String> titleURlResultMap = new HashMap<>();
        for (WebElement searchResult : searchResults) {
            String title = searchResult.getText();
            String url = searchResult.getAttribute("href");
            System.out.println("title  : " + title);
            System.out.println("url : " + url);
            titleURlResultMap.put(url, title);
        }
        for (Map.Entry<String, String> entry : titleURlResultMap.entrySet()) {
            System.out.println("url " + entry.getKey());
            System.out.println("title " + entry.getValue());
            System.out.println();
        }
    }*/
}




