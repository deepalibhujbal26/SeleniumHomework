package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class E4Window {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&emr=1&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&ifkv=AYZoVhdvk9tktwYz5xdkoeIqt3ynQarlKRYBgIy6zwqeiTWWGp0pONOd1ErfZH3y7QmRa0_Uqd5dsw&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        WebElement helpbtn= driver.findElement(By.xpath("//a[text()='Help']"));
        helpbtn.click();

        WebElement privacy= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        WebElement terms=driver.findElement(By.xpath("//a[text()='Terms']"));
        terms.click();

        //get the main page
      String mainpageHandle=  driver.getWindowHandle();
        System.out.println("Current hanklde"+mainpageHandle);
        //get all handles

        Set<String> allHandles=driver.getWindowHandles();
        for(String handle: allHandles){
            driver.switchTo().window(handle);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Terms of Service – Privacy &amp; Terms – Google")){
                break;
            }

        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        //switch to main page window
        driver.switchTo().window(mainpageHandle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());







    }

}
