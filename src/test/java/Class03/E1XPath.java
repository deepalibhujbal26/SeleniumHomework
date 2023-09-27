package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1XPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/Xpath.php");

        //find the text box and send some keys
        WebElement textbox1 = driver.findElement(By.xpath("//input[@id='title']"));
        textbox1.sendKeys("Batch16");

        //find the text box and send some kyes
        WebElement textbox2 = driver.findElement(By.xpath("//input[@name='title']"));
        textbox2.sendKeys("Batch17");

        WebElement question1 = driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        question1.sendKeys("what is color of sun");

        WebElement themagincaltext = driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(themagincaltext.getText());

        //get the text
        WebElement textBoxAPI = driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        textBoxAPI.sendKeys("abdffdgdfgf");

        //get the email
        WebElement email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("abc@gmail.com");

        //get the email2
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("xyz@gmail.com");

        //get the email3
        WebElement email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("PQR@gmail.com");

        //get below fiedls
      WebElement fields1=  driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
      fields1.sendKeys("cat");

      //get below fiels
        WebElement field2=driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
        field2.sendKeys("CatterPiller");

    }

}
