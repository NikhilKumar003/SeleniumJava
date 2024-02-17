package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        String passwrd= Cname(driver);
        String usrname= Sname(driver);
        String logintxt= Lname(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        String pName= driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText();
        Thread.sleep(2000);
        WebElement elmnt= driver.findElement(By.xpath("//input[contains(@type,'text')]"));
        elmnt.sendKeys(passwrd);
        Thread.sleep(1000);
        elmnt.clear();
        Thread.sleep(1000);
        elmnt.sendKeys(usrname);
        Thread.sleep(1000);
        elmnt.clear();
        elmnt.sendKeys(logintxt);
        Thread.sleep(2000);

        driver.quit();
    }

     public static String Cname(WebDriver driver){
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String pName= driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText();
//        WebElement type= driver.findElement(By.xpath("//input[contains(@type,'text')]"));
        return pName;

    }

    public static String Sname(WebDriver driver){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String signup= driver.findElement(By.xpath("//div/button[3]")).getText();
//        WebElement type= driver.findElement(By.xpath("//input[contains(@type,'text')]"));
        return signup;

    }

    public static String Lname(WebDriver driver){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String login= driver.findElement(By.xpath("//header/div/button[2]")).getText();
//        WebElement type= driver.findElement(By.xpath("//input[contains(@type,'text')]"));
        return login;

    }
}
