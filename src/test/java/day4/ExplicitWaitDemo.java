package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
     public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //declarartion-->i.e we had to create object of it !
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        txtusername.sendKeys("Admin"); //this tell that identification of webelements is inclusive in case of explicit waits !

        //so weherever element we are getting synchronization prroblem we make explicit wait for it !
        //so how it works? firstly condition is checked that is visible for ex if not it wait for 10 sec if not found it also give
        // exception error like other wait statements so we had to use try-catch block for it !
    }
}
