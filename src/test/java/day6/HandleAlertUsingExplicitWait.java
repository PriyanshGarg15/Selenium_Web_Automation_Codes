package day6;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();


        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
        myalert.accept(); //click on OK button

    }

}
