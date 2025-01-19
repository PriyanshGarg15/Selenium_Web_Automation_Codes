package day3;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser window !

        Thread.sleep(5000);
        driver.close(); //parent window closes becz driver focus on first browser window until we shift its focus !

        // driver.quit();//close all windows!

        


    }
}
