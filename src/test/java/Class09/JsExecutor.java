package Class09;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import utils.CommonMethods;

import static java.awt.SystemColor.window;

public class JsExecutor  extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/simple_context_menu.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //Scroll down operation , declare the instance of JSExecutor

        JavascriptExecutor Js=(JavascriptExecutor) driver;
        Js.executeScript("window.scrollBy(0, 500)");
        Js.executeScript("window.scrollBy(0,-500)");





    }
}
