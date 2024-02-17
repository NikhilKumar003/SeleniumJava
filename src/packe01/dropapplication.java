package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropapplication {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sales.leo1.in/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("solletravinder@financepeer.co");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//span[@class='MuiButton-label-213']")).click();
        Thread.sleep(2000);
        driver.manage().window().maximize();
//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(100,arguments[0]);", pixels);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,12500)");
        By.xpath("//h1[text()='Drop Applications']");
//        driver.findElement(By.xpath("//h1[@contains]"))
        Thread.sleep(2000);
    }
}