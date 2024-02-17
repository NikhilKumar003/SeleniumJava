package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlcontrols {
    public static void main(String[] args) throws Exception {
        WebDriver driver =new ChromeDriver();
        driver.get("https://institute.leo1.in/GTPL%20LEO1/fee-payment/student-list");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("femalerb")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("hindichbx")).click();
        Thread.sleep(1000);
        WebElement box = driver.findElement(By.id("chinesechbx"));
        if (box.isSelected())
            box.click();
        Thread.sleep(500);
        driver.findElement(By.className("bcTextBox")).sendKeys("Test nikhil");
        Thread.sleep(500);
        driver.findElement(By.id("registerbtn")).click();
        Thread.sleep(500);
        System.out.println(driver.findElement(By.id("msg")).getText());
        Thread.sleep(500);
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();
    }
}
