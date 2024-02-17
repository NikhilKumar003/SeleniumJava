package packe01;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class E2EonSpeiceJet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]")).click();
        Thread.sleep(2000);
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
        driver.findElement(By.cssSelector("#divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i=0;i<=5;i++){
            driver.findElement(By.cssSelector("#hrefIncAdt")).click();
        }
        driver.findElement(By.xpath("//input[@value='Done']")).click();

        Select select =new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
        select.selectByIndex(1);

        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

    }
}