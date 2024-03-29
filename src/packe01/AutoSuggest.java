package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggest {
    public  static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("aus");
        Thread.sleep(1000);
        List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option : options)
        {
            if(option.getText().equals("Austria"))
            {
                option.click();
            }

            break;
        }
    }
}
