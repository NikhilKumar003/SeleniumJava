package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findelementswithxpath {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //dynamic waits
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("cars");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Search']")).click();
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'trucks')]")).click();
//        driver.findElement(By.xpath("//span[@aria-label='Auction selected']")).click();
        Select drpdwm =new Select(driver.findElement(By.name("make")));
        drpdwm.selectByVisibleText("Acura");
        //size on links in page
        List <WebElement> linklist= driver.findElements(By.tagName("a"));
        System.out.println(linklist.size());
        // texts on links
        for (int i=0; i<linklist.size();i++){
        String linktext=  linklist.get(i).getText();
        System.out.println(linktext);
      }
}}

