package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframes {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

//        driver.findElement(By.id("name")).sendKeys("test-1"); //enter text in main html
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("test-2");
        driver.switchTo().frame("frm1"); //switch to 1st-iframe
        Thread.sleep(1000);
        Select course_dd =new Select(driver.findElement(By.id("course"))); //select the dropdown
        course_dd.selectByVisibleText("Java");
        Thread.sleep(1000);
        driver.switchTo().defaultContent(); // switch to default page
        driver.switchTo().frame("frm2"); // switch to 2nd frame
        driver.findElement(By.id("firstName")).sendKeys("HYR Test tutorial");
        driver.switchTo().defaultContent(); // switch to default page
        driver.findElement(By.id("name")).clear(); //clear the text fiel
        driver.findElement(By.id("name")).sendKeys("test-2");
        Thread.sleep(2000);
//        driver.switchTo().defaultContent(); // switch to default page
        driver.switchTo().frame("frm3");
        Thread.sleep(1000);

        driver.findElement(By.id("frm1"));
        Thread.sleep(1000);
        Select course_dd1 =new Select(driver.findElement(By.id("course"))); //select the dropdown
        course_dd1.selectByVisibleText("Java");

}}
