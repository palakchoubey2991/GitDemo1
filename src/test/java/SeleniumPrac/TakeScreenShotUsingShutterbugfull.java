package SeleniumPrac;

import com.assertthat.selenium_shutterbug.core.ElementSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TakeScreenShotUsingShutterbugfull {
    public static void main(String args[])
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://stackoverflow.com/questions/48423523/assert-in-selenium-in-not-working-for-me");
        Shutterbug.shootPage(driver).save("Test2.png");

    }
}
