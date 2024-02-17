package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class githubloginpage {
    public static void main(String[] args) throws Exception{
        WebDriver driver =new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement usertxt =  driver.findElement(By.id("login_field"));
        if (usertxt.isDisplayed()){
            if (usertxt.isEnabled()){
                usertxt.sendKeys("nikhilkumar");
                String hi=usertxt.getAttribute("value");
                System.out.println(hi);
                Thread.sleep(1000);
                usertxt.clear();
                usertxt.sendKeys("nikhilkumar0115");
            }
            else System.err.println("text not enabled ");
        }
        else System.err.println("text not displayed");
    }
}
