package SeleniumPrac;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import java.io.File;

public class ScreenShotFull {
    public static void main(String args[]) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://stackoverflow.com/questions/48423523/assert-in-selenium-in-not-working-for-me");
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("Test1.png"));
    }
}
