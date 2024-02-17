package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuphandles {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("alertBox")).click(); //alert box
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());// prints the text of output-1
        Thread.sleep(2000);
        driver.findElement(By.id("confirmBox")).click(); //confirm box ok btn -1
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());// prints the text of output-2
        Thread.sleep(2000);
        driver.findElement(By.id("confirmBox")).click();// confirm box cancel btn
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());// prints the text of output-2-1
        Thread.sleep(2000);
        driver.findElement(By.id("promptBox")).click();// prompt box enter text and confirm
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("hyr testing pro");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());// prints the text of output -3
        Thread.sleep(2000);
        driver.findElement(By.id("promptBox")).click(); //prompt box cancel btn
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.quit();


    }}
