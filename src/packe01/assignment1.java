package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class assignment1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//input[contains(@class,'form-control ng')]")).sendKeys("Nikhil Kumar");
        driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("nikhilku@123");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("nik23456");
        driver.findElement(By.id("exampleCheck1")).click();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.cssSelector("#exampleFormControlSelect1")));
        select.selectByIndex(1);
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("22021999");
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[value='Submit']")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
    }
}
