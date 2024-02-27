package packe01;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePicker {
    public static  void main(String[] args){
        String month= "6";
        String day= "22";
        String year= "2028";
        String[] expectedList ={month,day,year};
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup__year")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText--from")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText--from")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
        driver.findElement(By.xpath("//abbr[.='"+day+"']")).click();

        List <WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for (int i=0; i<actualList.size();i++){
            System.out.println(actualList.get(i).getAttribute("value"));
//            Assert.assertTrue(actualList.get(i).getAttribute("value"),expectedList[1]);

        }
    }
}
