package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Highlighter;
import java.time.Duration;

public class paco2 {
    public static void main(String[] args) throws Exception  {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\Downloads\\chrome-win32 (1)\\chrome-win32\\chrome.exe");
        WebDriver driver =new ChromeDriver();
//        System.setProperty("webdriver.chrome.logfile", "\\Users\\Thinkpad\\Downloads\\chrome-win32 (1)\\chrome-win32\\chromedriver.log");

        driver.get("https://www.google.com/maps/@19.1204573,72.8869927,15z?entry=ttu");
        driver.manage().window().maximize();
        WebElement dd= driver.findElement(By.id("searchboxinput"));
        Thread.sleep(500);
        dd.sendKeys("warangal");
        dd.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebElement txt=driver.findElement(By.tagName("h1"));
        String  city=  txt.getText();
        System.out.println(city);
//        highlight(driver, driver.findElement(By.tagName("h1")));
//        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement sent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='Cw1rxd']")));
//        WebElement sent = wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='Cw1rxd']"))));

//        WebElement sent = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='Cw1rxd']")));
//        sent.click();
//        Thread.sleep(3000);
//        WebElement sent = driver.findElement(By.xpath("//span[@class='Cw1rxd']"));
//        sent.click();

//        driver.quit();

    }
}
