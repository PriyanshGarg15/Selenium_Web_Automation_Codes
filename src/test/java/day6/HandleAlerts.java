package day6;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleAlerts {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();


        // 1>Normal alert button with OK button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept();
        //if you want to do multiple operations with alert so store it in alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alertText = driver.switchTo().alert();
        System.out.println("Alert Text: " + alertText.getText());
        alertText.accept(); //OK button

        // 2> Confirm alert button with OK and Cancel buttons
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        // driver.switchTo().alert().accept(); //OK button
        driver.switchTo().alert().dismiss(); //cancel button
    

        // 3> Prompt alert button with OK and Cancel buttons
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys("Hello from Selenium");
        alertPrompt.accept(); //OK button




    }

}
