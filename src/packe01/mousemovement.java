package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class mousemovement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        Thread.sleep(200);
        String parentWindow= driver.getWindowHandle();
        System.out.println("parent address : "+ parentWindow);
//        driver.findElement(By.xpath("//div[contains(text(),'SpiceClub')]//parent::div[@tabindex='0']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Gift Card')]")).click();
        Set<String> handles = driver.getWindowHandles();
        for (String singlewind:handles) {
            if(!singlewind.equals(parentWindow)){
                driver.switchTo().window(singlewind);
                driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("finddd");
            }
        System.out.println(singlewind + driver.getTitle());
    }
//        driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("find element");
        driver.switchTo().window(parentWindow);
        Actions action =new Actions(driver); // to do mouse actions
        action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"))).build().perform();
//        driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]")).click();
        driver.findElement(By.linkText("Travel Assistance Services")).click();
        //mouse action on add-ons link text
        driver.findElement(By.xpath("//a[contains(text(),'DEALS')]")).click();
//        action.moveToElement(driver.findElement(By.xpath("//a[text()='Add-Ons']"))).build().perform();

}
}