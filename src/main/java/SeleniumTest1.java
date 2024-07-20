import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTest1 {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.iplt20.com/points-table/men/2023");
//        List<WebElement> points = driver.findElements(By.cssSelector("td[class='bt ng-binding']"));
//        for (WebElement point : points) {
//            int num = Integer.parseInt(point.getText());
//
//                if (num > 12)
//                {
//
//                    System.out.println(driver.findElement(By.xpath("//table[@class='ih-td-tab']/tbody/tr["+i+"]/td[@class='ih-t-color']/div/h2")).getText());
//                }
//
//            }
//        }
        int row=driver.findElements(By.xpath("//div[@class='ih-pcard-wrap'] //table[@class='ih-td-tab']/tbody/tr")).size();
        System.out.println(row);
        int col=driver.findElements(By.xpath("//div[@class='ih-pcard-wrap'] //table[@class='ih-td-tab']/tbody/tr/th")).size();
        System.out.println(col);
        ////div[@class='ih-pcard-wrap']//table[@class='ih-td-tab']//tr[3]/td[3]
        ////div[@class='ih-pcard-wrap']//table[@class='ih-td-tab']//tr[3]/td[11]
        for(int i=1;i<row;i++)
        {
           int num=12;
           int point=Integer.parseInt(driver.findElement(By.xpath("//div[@class='ih-pcard-wrap']//table[@class='ih-td-tab']//tr["+i+"]/td[11]")).getText());

           if(point>num)
           {
               System.out.println(driver.findElement(By.xpath("//div[@class='ih-pcard-wrap']//table[@class='ih-td-tab']//tr["+i+"]/td[3]")).getText());
           }
        }


        driver.quit();
    }
    }


