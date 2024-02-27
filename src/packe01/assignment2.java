package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class assignment2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));

        System.out.println(driver.findElement(By.cssSelector("p.text-center.text-white")).getText());
        String[] loginName= loginValues(driver);


        String logName= loginName[0];
        String passName= loginName[1];

        System.out.println(logName);
        System.out.println(passName);

        driver.findElement(By.cssSelector("input#username")).sendKeys(logName);
        driver.findElement(By.cssSelector("input#password")).sendKeys(passName);
        driver.findElement(By.xpath("//div[@class='form-check-inline']//label[2]//span[2]")).click();
//        driver.switchTo().alert().accept();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//div[2]//button[2]")));
        driver.findElement(By.xpath("//div[@class='modal-content']//div[2]//button[2]")).click();
//        w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='modal-content']//div[2]//button[2]")));
        WebElement dd= driver.findElement(By.cssSelector("select.form-control"));
        Select select =new Select(dd);
        select.selectByIndex(2);
        driver.findElement(By.cssSelector("input#terms")).click();
        driver.findElement(By.cssSelector("#signInBtn")).click();
        w.until(ExpectedConditions.titleIs("ProtoCommerce"));
//        home page
//        driver.findElement(By.xpath("//div[@class='card h-100']/div[2]/button")).click(); --> will use at add button

        addItems(driver);

    }

    private static void addItems(WebDriver driver) {
        List <WebElement> elmnts= driver.findElements(By.xpath("//div[@class='card-footer']//button"));
        for (int i=0;i<elmnts.size();i++){
            elmnts.get(i).click();
        }

        driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
    }



     public static String[] loginValues(WebDriver driver){
        String text= driver.findElement(By.cssSelector("p.text-center.text-white")).getText();
        String[] fname= text.split("is");
        fname[0].trim();
        String[] lname= fname[1].split("and");
        String actname= lname[0].trim();
        String pass= fname[2].trim();
        String paswrd=pass.replaceAll("[)]","");
//

         return new  String[]{actname,paswrd};

     }

}
