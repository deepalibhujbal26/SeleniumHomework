package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class E1ImplicitWaits extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/synchronization-waits.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser); //call this methods from utils packg

        //find the button and locakte
       WebElement btnclk =driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
            btnclk.click();
            //get the text that apperss

        //it will wait till the element is found using implicit wait
      WebElement  text1=driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
      String text=text1.getText();
         System.out.println(text);







    }
}
