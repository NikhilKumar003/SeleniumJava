package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsWithAction {
    public static void main(String[] args){
        WebDriver  driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("a.blinkingText")).click();
        String   parentWind= driver.getWindowHandle();
        driver.switchTo().window(parentWind);
        System.out.println("window:"+" "+parentWind+" "+ driver.getTitle() );
        Set <String> windows= driver.getWindowHandles();
        System.out.println(windows);
        Iterator <String> it= windows.iterator();
        String parntid= it.next();
        String childid= it.next();
        driver.switchTo().window(childid);
        String ss= driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        System.out.println(ss);
        driver.switchTo().window(parntid);
        driver.findElement(By.cssSelector("input#username")).sendKeys(ss);


//        Set<String> windows= driver.getWindowHandles();
//        for (String window :windows ) {
//            if(!window.equals(parentWind)){
//                driver.switchTo().window(window);
//            }

//            String ss = driver.findElement(By.cssSelector("p.im-para.red")).getText();
//            String ss1 = ss.split("at")[1].trim().split(" ")[0];
//            driver.switchTo().window(window);
//            driver.findElement(By.cssSelector("input#username")).sendKeys(ss1);
        }

    }

