package packe01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement option= driver.findElement(By.cssSelector("label[for='honda']"));
        option.click();
        String txt= option.getText();
        System.out.println(txt);
       WebElement drpdwn= driver.findElement(By.id("dropdown-class-example"));
       drpdwn.sendKeys(txt);
       driver.findElement(By.cssSelector("input#name.inputs")).sendKeys(txt);
       driver.findElement(By.cssSelector("input#alertbtn")).click();
       System.out.println(driver.switchTo().alert().getText().contains("Option3"));
        driver.switchTo().alert().accept();

//        Select stt=new Select(drpdwn);
//        stt.selectByIndex(1);
    }
}
