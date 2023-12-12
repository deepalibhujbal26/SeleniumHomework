package Class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class Screenshot extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";

        openBrowserAndLaunchApplication(url, browser);

        // Capture the screenshot and declare the instance
        TakesScreenshot ss = (TakesScreenshot) driver;

        // Take the screenshot and assign it to a File variable
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);

        // Define the destination path and file name
        File destinationFile = new File("/Users/deepali/IdeaProjects/SeleniumBasic/screenShot/abc.png");

        try {
            // Copy the screenshot file to the destination
            FileUtils.copyFile(sourceFile, destinationFile);
            System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }

    }

