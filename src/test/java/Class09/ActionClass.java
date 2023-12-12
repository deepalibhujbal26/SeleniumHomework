package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class ActionClass extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/simple_context_menu.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement hover = driver.findElement(By.xpath("//button[text()='Hover me!']"));

        //action class is used to performer mouse over operation
        Actions action = new Actions(driver);
        action.moveToElement(hover).perform();

        //TASK2
        //draggable
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));

        //droplocation
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));
       // action.dragAndDrop(draggable, dropLocation).perform();

        //build method is used to combine all method together then perform
        //or we can say whenever changing more than 1 methods
        action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform();



    }
}
