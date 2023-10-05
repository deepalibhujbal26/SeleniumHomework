package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Practic2Window {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&emr=1&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&ifkv=AYZoVhdvk9tktwYz5xdkoeIqt3ynQarlKRYBgIy6zwqeiTWWGp0pONOd1ErfZH3y7QmRa0_Uqd5dsw&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        WebElement helpbtn= driver.findElement(By.xpath("//a[text()='Help']"));
        helpbtn.click();

        WebElement privacy= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();
        // get current handle using gmail
        String gmailHandle= driver.getWindowHandle();
        System.out.println(gmailHandle);

        //get all handles
        Set<String>handle=driver.getWindowHandles();
        //use loop to go through all window to find desired one
        for(String handleWindow: handle){
            //first switch to then get the title
            driver.switchTo().window(handleWindow);
             String title=driver.getTitle();
             if(title.equalsIgnoreCase("Google Account Help")){
                 break;

             }

        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());



    }
}
