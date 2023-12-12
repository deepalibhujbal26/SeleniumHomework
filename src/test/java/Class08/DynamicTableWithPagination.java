package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class DynamicTableWithPagination  extends CommonMethods {

    //element on same page
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser); //call this methods from utils packg

        try{
            WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
            userName.sendKeys("Admin");

            WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
            password.sendKeys("Hum@nhrm123");

            WebElement loginButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
            loginButton.click();

           WebElement PIM =driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
           PIM.click();

            List<WebElement>idColumn=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));


            for (int i = 0; i <idColumn.size() ; i++) {
                String id=idColumn.get(i).getText();

                if(id.equals("357842")){
                   WebElement checkbox =driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
                    checkbox.click();
                }

            }



        }catch (Exception e){
            System.out.println("Element not found");
        }

    }
}
