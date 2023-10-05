package Class06;

import com.sun.security.jgss.GSSUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class E2WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signin/v2/challenge/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&emr=1&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&ifkv=AYZoVhfJ6TCgpsNkUuu_rSQo51qqq6W5MPfvdMsS0zbTcGBrYpe6tknVtRzhNw9YWhyaJgZDmNfKfQ&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AJeL0C6u-KbDLrxHIK8DbFJ4IRMuuG8RYnOQJMivO2o-KRsmNpU1_KrCr8JYpKSE");

        //click on help
        WebElement helpbtn= driver.findElement(By.xpath("//a[text()='Help']"));

        //click on privacy
        WebElement privacybtn= driver.findElement(By.xpath("//a[text()='Privacy']"));

        helpbtn.click();
        privacybtn.click();
        //get the window of mainpage//current page ie gmail.com and print in it oon console
        //as are webdriver currently foucs on Gmail page we can use driver.getwindowHandle to get current page
       String gmailHandle = driver.getWindowHandle();
        System.out.println(gmailHandle);

        //switch focus of your webdriver to privacy window
        //get all the handles and find the desired one
        Set<String>allhandles=driver.getWindowHandles();

        //loop thrught all the handles and find desired one
        for(String handle :allhandles){
            //switch to handle first
            driver.switchTo().window(handle);
            //get the title of window whiich the focus is
           String title=driver.getTitle();
           //check i  title matche your desired title,if yes the break the loop ,if no repeat the process
           if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
               break;
           }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());



    }
}
