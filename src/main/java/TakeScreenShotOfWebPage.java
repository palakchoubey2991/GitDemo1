import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TakeScreenShotOfWebPage {
    public static void main(String args[])
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.iplt20.com/points-table/men/2023");
        File sc= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    }
}
