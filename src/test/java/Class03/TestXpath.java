package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXpath {

    // //input[@id='title']
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/Xpath.php");

        WebElement textbox1=driver.findElement(By.xpath("//input[@id='title']"));
        textbox1.sendKeys("Deepali");

        WebElement textBox2=driver.findElement(By.xpath("//input[@id='DisplayName' and @name='title']"));
        textBox2.sendKeys("DeepaliBhujabl");

        WebElement securityText=driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        securityText.sendKeys("Hello Security using contain");

        WebElement displayLabel=driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum ')]"));
        System.out.println(displayLabel.getText());

        WebElement apiStart=driver.findElement(By.xpath("//input[starts-with(@id,'apiSetting')]"));
        apiStart.sendKeys("starts-with()");

        driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]")).sendKeys("Using index");
        driver.findElement(By.xpath("//input[@name='customField' and @data-detail='one']")).sendKeys("using AND");

        //Our choice X path
        driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='one']")).sendKeys("USED AND OP");
        driver.findElement(By.xpath("(//input[@name='customField1'])[2]")).sendKeys("Using index");




    }
}
