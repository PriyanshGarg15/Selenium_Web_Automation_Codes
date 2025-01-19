package day3;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String title=driver.getTitle();
        System.out.println(title);

        String url=driver.getCurrentUrl();
        System.out.println(url);

        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
        //use-sometimes we want to do vaidation on page source like wether some element is presen in page source or not

        String windowid=driver.getWindowHandle();
        System.out.println(windowid);
        //as id gets created by browser for a particular window at runtime so it keeps on changing !


        Thread.sleep(5000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser window !
        Set<String> windowids=driver.getWindowHandles();
        System.out.println(windowids);
        //use:-suppose through auomation u want to close a brwoser window so here comes its use!
        //we will have to use this windowids to switch bwtween windows !

        


    }
}
