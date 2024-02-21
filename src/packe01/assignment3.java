package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class assignment3 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String parntwin= driver.getWindowHandle();
         driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> windows= driver.getWindowHandles();
        driver.switchTo().window(parntwin);
        Iterator<String> IT= windows.iterator();
        String prntwin = IT.next();
        String childwin =IT.next();
        driver.switchTo().window(childwin);
        String ss1= driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
        System.out.println(ss1);
        driver.switchTo().window(parntwin);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
    }
}
