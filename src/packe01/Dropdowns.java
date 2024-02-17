package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {
    public static void main(String[] args) throws Exception {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        WebElement courseelement= driver.findElement(By.id("course"));
//        Select coursename = new Select(courseelement);
//        List <WebElement> courselist=  coursename.getOptions();
//        for (WebElement option:courselist ) {
//            System.out.println(option.getText());
//        }
//        coursename.selectByIndex(1);
//        Thread.sleep(1000);
//        coursename.selectByValue("python");
//        Thread.sleep(1000);
//        coursename.selectByVisibleText("Javascript");
////now will do multi selection dropdown
//        String selecteddropdown=coursename.getFirstSelectedOption().getText();
//        System.out.println("selected value" +selecteddropdown );
//
        WebElement ideelement= driver.findElement(By.id("ide"));
        Select idename = new Select(ideelement);
        idename.selectByValue("ec");
        Thread.sleep(1000);
        idename.selectByIndex(1);
        Thread.sleep(1000);
        idename.selectByVisibleText("NetBeans");
        Thread.sleep(1000);
        idename.deselectByValue("ec");
        Thread.sleep(1000);
        List <WebElement> idelist=idename.getAllSelectedOptions();
        for (WebElement ideoption:idelist)
        {
        System.out.println("selected options -"+ ideoption.getText());
        }
        }
        }
