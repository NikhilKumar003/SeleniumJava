package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArrayList {

    public static void main(String[] args) throws InterruptedException {

        String[] itemsNeeded ={"Brocolli","Cucumber","Carrot"}; //note down the products
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
        addItems(driver, itemsNeeded);
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//        Thread.sleep(2000);
        w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input.promoCode"))));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

        driver.findElement(By.cssSelector("button.promoBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo"))));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


    }

    public static void addItems(WebDriver driver, String[] itemsNeeded){

        int j=0; //used to run only 3 times
        //get list of elements with product name
        List <WebElement> itemNames= driver.findElements(By.cssSelector("h4.product-name"));
        // get size of products
        for (int i=0; i<itemNames.size();i++) {
            // convert elements to text, split and trim, store in new variable string
            String[] name= itemNames.get(i).getText().split("-");
            String formattedName=name[0].trim();
//           covert string into string list
            List itemsList= Arrays.asList(itemsNeeded);

//           String products= itemNames.get(i).getText();

            if (itemsList.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if(j==itemsNeeded.length){
                    break;
                }
            }
        }

    }
}
