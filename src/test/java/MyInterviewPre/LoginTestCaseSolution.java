package MyInterviewPre;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCaseSolution {
    WebDriver driver;

    WebElement emailId;
    WebElement password;
    WebElement loginButton;


    @Before
    public void open() {
        driver = new ChromeDriver();
        emailId = driver.findElement(By.id("email-input"));
        password = driver.findElement(By.id("password-input"));
        loginButton = driver.findElement(By.id("login-button"));

    }

    @After
    public void close() {
        driver.close();
    }

    @Test
    public void testLoginFormIsPresent() {
        //Email input is present
        //password input is present
        //login button is present
        boolean isEmailIdDisplayed = emailId.isDisplayed();
        boolean isPasswordDisplayed = password.isDisplayed();
        boolean isLoginButtonDisplayed = loginButton.isDisplayed();
        Assert.assertTrue("Email id Field is not displayed", isEmailIdDisplayed);
        Assert.assertTrue("Password field is not displayed", isPasswordDisplayed);
        Assert.assertTrue("Login Button  is not displayed", isLoginButtonDisplayed);
    }

    @Test
    public void testValidCredentials() {
        //enter Valid email id
        emailId.sendKeys("login@codility.com");
        //enter valid password
        password.sendKeys("password");
        //click on login button
        loginButton.click();
        System.out.println("Welcome to Codility is visible");

        //verify msg "Welcome to Codility" is displayed
        //locate the element "Welcome to codility "
    }

    @Test
    public void testInvalidCredentials() {
        //enter inValid email id
        emailId.sendKeys("unknown@codility.com");
        //enter invalid password
        password.sendKeys("password123");
        //click on login button
        loginButton.click();
        //verify msg "you shall not pass! Arr!" is displayed
        System.out.println("you shall not pass ! Arr!");
        //locate the element of Error Message

    }

    @Test
    public void testEmailValidation() {
        //enter Incorrect email id
        emailId.sendKeys("unknowncodility.com");

        //enter valid password
        password.sendKeys("password");

        //click on login button
        loginButton.click();

        //verify msg "Enter a valid email" is displayed
        //locate the Error msg of email Field"

    }

    @Test
    public void testEmptyFields() {
        // user do not enter email id

        // user do not enter password
        //click on login button
        loginButton.click();
        //verify msg "Email is Required" and "Password is Required" is displayed
        //locate the msg for empty field and disaplyed

    }

}
