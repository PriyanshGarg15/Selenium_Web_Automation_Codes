package day6;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleCheckboxes {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        // 1>selecting specefic checkbox
        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2>selecting all checkboxes
        //step 2.1> selecting all checkboxes into a variable so
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        //or
        for(int i=0;i<checkboxes.size();i++) {
            checkboxes.get(i).click();
        }

        //3>Select last 3 checkboxes 
        List<WebElement> lastCheckboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
        for (int i=lastCheckboxes.size()-3; i<lastCheckboxes.size(); i++) {
            lastCheckboxes.get(i).click();
        }

        // 4>Select first 3 checkboxes
        List<WebElement> firstCheckboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
        for (int i=0; i<3; i++) {
            firstCheckboxes.get(i).click();
        }

        //5>deselect all selected checkboxes
        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
        for (WebElement checkbox : allCheckboxes) {
            if(checkbox.isSelected()) {
                checkbox.click();
            }
        }

    

        
    }

}
