package day5;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver =new ChromeDriver();
        // driver.get("https://demo.nopcommerce.com/");

        URL myurl=new URL("https://demo.nopcommerce.com/");
        driver.navigate().to(myurl);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

    }
}
