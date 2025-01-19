package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a02_using_css_locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        //css selectors/locators

        //tag id combination
        // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MAC");
        //as told that if we are able to find using only id then tag is optional so
        // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MAC");

        //tag class combination
        // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MAC");
        //as told that if we are able to find using only class then tag is optional so
        // driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MAC");

        //tag attribute combination
        // driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("MAC");
        //as told that if we are able to find using only attribute name then tag is optional so
        driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("MAC");

        //tag class attribute combination
        // driver.findElement(By.cssSelector("input.input-text[placeholder=\"Search store\"]")).sendKeys("MAC");
        //as told that if we are able to find using only attribute name then tag is optional so
        driver.findElement(By.cssSelector("[placeholder=\"Search store\"][class=\"input-text\"]")).sendKeys("MAC");

    }
}
