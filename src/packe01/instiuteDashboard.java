    package packe01;

    import org.openqa.selenium.*;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.Select;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import javax.swing.*;
    import java.time.Duration;
    import java.time.Instant;
    import java.util.concurrent.TimeUnit;

    public class instiuteDashboard {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            Instant startime= Instant.now();
            System.out.println(startime.toString());
            driver.get("https://uat2institute.leo1.in/institute/login");
            Instant endtime= Instant.now();
            System.out.println(endtime.toString());
            Duration totaltime =Duration.between(startime,endtime);
            System.out.println("total time taken" +" "+ totaltime.toMillis());
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            //dynamic waits
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[contains(@type,'Email')]")).sendKeys("victor.n@financepeer.co");
            driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("iphoneTen123!");
            driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Fee Payment')]")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Student List')]")).click();
           try {
                // Code that may throw StaleElementReferenceException
                WebElement addStudent = driver.findElement(By.xpath("//button[@class='PrimaryButton_button__tfJh7 d-flex align-items-center' and @type='button' and @tabindex='0']/span[contains(text(),'Student')]"));
                Actions action = new Actions(driver);
                action.moveToElement(addStudent).click().build().perform();
            } catch (StaleElementReferenceException e) {
                // Retry the action
                WebElement addStudent = driver.findElement(By.xpath("//button[@class='PrimaryButton_button__tfJh7 d-flex align-items-center' and @type='button' and @tabindex='0']/span[contains(text(),'Student')]"));
                Actions action = new Actions(driver);
                action.moveToElement(addStudent).click().build().perform();
            }
                  WebElement addstudent = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
            WebElement DialogBody = addstudent.findElement(By.xpath("//span[text()='Add New Student']"));
            System.out.println("Header of dialog " + DialogBody.getText());
            WebElement instname = driver.findElement(By.xpath("//div[text()='Select Institute']//parent::div[@class=' css-hlgwow']"));
//            instname.click();
//            WebElement dropdwn=instname.findElement(By.xpath("//div[@class=' css-19bb58m']"));
            for (int i=0;i<=1;i++){
                instname.sendKeys(Keys.ARROW_DOWN);
            }
            instname.sendKeys(Keys.ENTER);


//            instname.findElement(By.xpath("//div[contains(text(),'e-Techno')]")).click();
            WebElement branch=driver.findElement(By.xpath("//div[text()='Select Branch']//parent::div[@class=' css-hlgwow']"));
            branch.click();
            branch.findElement(By.xpath("//div[contains(text(),'HANUMAKONDA')]")).click();
            WebElement course= driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[3]"));
            course.click();
            WebElement coursename=driver.findElement(By.xpath("//div[contains(text(),'QA Test')]"));
            coursename.click();
            WebElement classdd =driver.findElement(By.xpath("//div[text()='Select Class']//parent::div[@class=' css-hlgwow']"));
            classdd.click();
            classdd.findElement(By.xpath("//div[contains(text(),'test-1')]")).click();
    //                driver.findElement(By.xpath("//div[contains(text(),'test-1')]")).click();
            driver.findElement(By.xpath("//input[@placeholder='Enter Student Name']")).sendKeys("Test Nikhil Automwetee");
            driver.findElement(By.xpath("//input[@placeholder='Enter Student ID']")).sendKeys("GT AUTO 131");
            driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7811290415");
            driver.findElement(By.xpath("//button[contains(text(),'Add Student')]")).click();

    //        }
    }
    }
