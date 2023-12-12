package MyInterviewPre;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTestSyntax {
    WebDriver driver;

    WebElement username;
    WebElement password;
    WebElement loginButton;


    @Before
    public void open() {
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        username = driver.findElement(By.id("txtUsername"));
        password = driver.findElement(By.id("txtPassword"));
        loginButton = driver.findElement(By.id("btnLogin"));

    }

    @After
    public void close() {

        driver.close();
    }

    @Test
    public void testLoginFormIsPresent() {
        //Email input is present
        boolean isEmailIdDisplayed = username.isDisplayed();
        //password input is present
        boolean isPasswordDisplayed = password.isDisplayed();
        //login button is present
        boolean isLoginButtonDisplayed = loginButton.isDisplayed();
        Assert.assertTrue("Email id Field is not displayed", isEmailIdDisplayed);
        Assert.assertTrue("Password field is not displayed", isPasswordDisplayed);
        Assert.assertTrue("Login Button  is not displayed", isLoginButtonDisplayed);
    }

    @Test
    public void testValidCredentials() {
        //enter Valid email id
        username.sendKeys("admin");
        //enter valid password
        password.sendKeys("Hum@nhrm123");
        //click on login button
        loginButton.click();
        System.out.println("Welcome to Codility is visible");

        //assertion
        WebElement welcomeAdminPage = driver.findElement(By.id("welcome"));
        boolean isWelcomePageDisplayed = welcomeAdminPage.isDisplayed();
        String welcomeMsg = welcomeAdminPage.getText();
        Assert.assertEquals(welcomeMsg, "Welcome Admin");
        Assert.assertTrue("Welcome Admin is not displayed", isWelcomePageDisplayed);

    }

    @Test
    public void testInvalidCredentials() {
        //enter inValid email id
        username.sendKeys("unknown@codility.com");
        //enter invalid password
        password.sendKeys("Hum@nhrm123");
        //click on login button
        loginButton.click();
        //verify msg "you shall not pass! Arr!" is displayed
        //  System.out.println("you shall not pass ! Arr!");
        //locate the element of Error Message

        WebElement invalidMessage = driver.findElement(By.id("spanMessage"));
        String actaulMsg = invalidMessage.getText();
        Assert.assertEquals("Invalid credentials", actaulMsg);

    }

    @Test
    public void testEmailValidation() {
        //enter Incorrect email id
        username.sendKeys("Admin@syntax");

        //enter valid password
        password.sendKeys("Hum@nhrm123");

        //click on login button
        loginButton.click();

        //verify msg "Enter a valid email" is displayed
        //locate the Error msg of email Field"
        WebElement invalidMessage = driver.findElement(By.id("spanMessage"));
        String actaulMsg = invalidMessage.getText();
        Assert.assertEquals("Invalid credentials", actaulMsg);


    }

    @Test
    public void testEmptyFields() {
        // user do not enter email id

        // user do not enter password
        //click on login button
        loginButton.click();
        //verify msg "Email is Required" and "Password is Required" is displayed
        //locate the msg for empty field and disaplyed

        WebElement emptyFieldMessage = driver.findElement(By.id("spanMessage"));
        String actaulMsg = emptyFieldMessage.getText();
        Assert.assertEquals("Username cannot be empty", actaulMsg);


    }

}
