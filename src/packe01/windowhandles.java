package packe01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowhandles {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //single window
//        String parentWindow=driver.getWindowHandle();// store the value of parent window
//        System.out.println("parent window name "+ parentWindow + driver.getTitle()); //store the title of parent window
//        driver.findElement(By.id("newWindowBtn")).click();
//        Thread.sleep(2000);
//        Set <String> multiplwindows = driver.getWindowHandles(); // get values of multiple windows
//        for (String singlewindow: multiplwindows) {
//            if (!singlewindow.equals(parentWindow)){  //child window will verify with parent window
//                driver.switchTo().window(singlewindow); // switch to child window
//                driver.findElement(By.id("firstName")).sendKeys("hyr testing sir");
//            }
//        System.out.println(singlewindow + driver.getTitle()); // prints window titles
//        }
//        Thread.sleep(2000);
//        driver.switchTo().window(parentWindow); // swith to parent window
//        driver.findElement(By.id("name")).sendKeys("hyr testing pro");
//        Thread.sleep(5000);

        //single tab
        String parenttab=driver.getWindowHandle();// store the value of parent window
        System.out.println("parent window name "+ parenttab + driver.getTitle()); //store the title of parent window
        driver.findElement(By.id("newTabBtn")).click();
        Thread.sleep(2000);
        Set <String> multipletabs = driver.getWindowHandles(); // get values of multiple windows
        for (String singletab: multipletabs) {
            if (!singletab.equals(parenttab)){  //child window will verify with parent window
                driver.switchTo().window(singletab); // switch to child window
                driver.findElement(By.id("confirmBox")).click(); //confirm box ok btn -1
                Thread.sleep(2000);
                System.out.println(driver.switchTo().alert().getText());
                Thread.sleep(2000);
                driver.switchTo().alert().accept();
            }
//            System.out.println(singletab + driver.getTitle()); // prints window titles
        }
        Thread.sleep(2000);
        driver.switchTo().window(parenttab); // swith to parent window
        driver.findElement(By.id("name")).sendKeys("hyr testing pro");


    }
}
