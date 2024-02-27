package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Mislleneous {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        limiting webdriver scope
        WebElement Footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
        System.out.println(Footer.findElements(By.tagName("a")).size());
        WebElement ftr = Footer.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
        System.out.println(ftr.findElements(By.tagName("a")).size());
        for (int i = 1; i < ftr.findElements(By.tagName("a")).size(); i++) {

            String clickbtn = Keys.chord(Keys.CONTROL, Keys.ENTER);
            ftr.findElements(By.tagName("a")).get(i).sendKeys(clickbtn);
        }
            Set<String> abc = driver.getWindowHandles();
            Iterator<String> it = abc.iterator();
           while (it.hasNext())
           {
               driver.switchTo().window(it.next());
               System.out.println(driver.getTitle());
           }


    }
}