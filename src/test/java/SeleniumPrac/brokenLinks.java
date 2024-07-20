package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class brokenLinks {
    public static void main(String args[]) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        for(WebElement link:links)
        {

            String url=link.getAttribute("href");
           HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
           conn.setRequestMethod("HEAD");
           conn.connect();
           int code=conn.getResponseCode();
           if(code>400)
           {
               System.out.println("the broken links are : "+code);
               //Assert.assertTrue(false);


           }
        }

    }

}
