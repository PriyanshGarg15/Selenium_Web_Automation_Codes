package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a01_first_element_using {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();

        //name
        // driver.findElement(By.name("search")).sendKeys("Mac");;
        
        //id
        // boolean isLogoDispayed=driver.findElement(By.id("logo")).isDisplayed();
        // System.out.println(isLogoDispayed);

        //linktext and partialLinkText  (only used with links !)
        // driver.findElement(By.linkText("Tablets")).click();
        // driver.findElement(By.partialLinkText("lets")).click();

        //TagName and ClassName (They both are used for locating multiple elements of the page)
        //like many have li tag 
        //suppose to count no of images / links in our page etc.

        //classname:-
        //ex:-capture total links in header part
        // List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
        // System.out.println(headerLinks);
        
        //tagname:-
        //ex:-find total links in our web page
        // List<WebElement>  links=driver.findElements(By.tagName("a"));
        // System.out.println(links.size());
        //ex:-find total images in webpage
        List<WebElement>  images=driver.findElements(By.tagName("img"));
        System.out.println(images.size());
    }
}
