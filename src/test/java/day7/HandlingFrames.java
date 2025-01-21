package day7;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingFrames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();


        // driver.switchTo().frame(id);
        // driver.switchTo().frame(name);



        // driver.switchTo().frame(WebElement);
        //going to frame1
        WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1");
        driver.switchTo().defaultContent();
        //going to frame 2
        WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2");
        driver.switchTo().defaultContent();
        //going to frame 3
        WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame3");
        driver.switchTo().defaultContent();
        //inner iframe inside frame3
        //so how to do so
        //as we have only one iframe/frame inside frame3 so we will use indexing concept if frame switch
        // driver.switchTo().frame(frameindex);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
        // //or use if not able to click
        // WebElement radiobutton=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
        // JavascriptExecutor js=(JavascriptExecutor)driver;
        // js.executeScript("arguments[0].click()",radiobutton);
        driver.switchTo().defaultContent();


        
    }
}
