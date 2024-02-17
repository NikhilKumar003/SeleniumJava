package packe01;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class dynDDwn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       /* driver.findElement(By.cssSelector("#divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i=0;i<=5;i++){
            driver.findElement(By.cssSelector("#hrefIncAdt")).click();
        }
        //ctl00_mainContent_ddl_originStation1_CTXT
        driver.findElement(By.xpath("//input[@value='Done']")).click();*/
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@value='HYD']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            Assert.assertTrue(true);
            }
        else{
            Assert.assertTrue(false);
        }



    }


}
