package day6;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandeAuthenticationPopups {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        // driver.manage().window().maximize();

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();



    }

}
