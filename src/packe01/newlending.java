    package packe01;

    import org.openqa.selenium.*;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.util.concurrent.TimeUnit;

    public class newlending {
        public static void main(String[] args)  {
            WebDriver driver = new ChromeDriver();
            driver.get("https://uat1lending.leo1.in/");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
    //        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    //        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

            driver.findElement(By.id("mobileNumber")).sendKeys("7842290549");
    //         driver.findElement(By.xpath("//input[@name='name']")).sendKeys("nikhil kumar");
            driver.findElement(By.id("name")).sendKeys(Keys.CONTROL + "a");
            driver.findElement(By.id("name")).sendKeys(Keys.DELETE);
            driver.findElement(By.id("name")).sendKeys("nikhil kumar");
            driver.findElement(By.xpath("//input[@id='loanAmount']")).sendKeys("35009");
            driver.findElement(By.xpath("//input[@type='radio']")).click();
    //        driver.findElement(By.xpath("//input[@id='studentName']")).sendKeys("test name nikhil ");


        }
    }
