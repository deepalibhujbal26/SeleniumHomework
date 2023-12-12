package Review2;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Practice3WindowHandle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&osid=1&passive=1209600&service=mail&ifkv=AYZoVhfoJWtds6jzV1BVoNt_2lGdm4Kx-hff-ppMOMhQpJNhR0n7DS7xDtJ0ve7UDU6E8sMCOePBPg&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        WebElement helpbtn= driver.findElement(By.xpath("//a[text()='Help']"));
        helpbtn.click();

        WebElement privacy= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        WebElement terms=driver.findElement(By.xpath("//a[text()='Terms']"));
        terms.click();

        String mainHandle=driver.getWindowHandle();

        Set<String>allHandle=driver.getWindowHandles();
        for(String handle1 :allHandle){
            driver.switchTo().window(handle1);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Terms of Service – Privacy &amp; Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(mainHandle);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
