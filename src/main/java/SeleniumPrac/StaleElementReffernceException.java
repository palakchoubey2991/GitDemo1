package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StaleElementReffernceException {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.pavantestingtools.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement link=driver.findElement(By.xpath("//a[text()='Online Training']"));
        link.click();
        driver.navigate().back();
        Thread.sleep(5000);


        try
        {
            link.click();
        } catch (StaleElementReferenceException e) {

             link=driver.findElement(By.xpath("//a[text()='Online Training']"));
            link.click();
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
            //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""));
            WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));


        }


    }
}
