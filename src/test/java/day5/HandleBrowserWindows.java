package day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> WindowIds=driver.getWindowHandles();

        //Aproach 1 to get id needed (using conversion set to list )(used when you open 2-3 extra window)
        //why we convert to list?
        //becz if we use set we will not be able to get individual items 
        //i.e we dont have get method in set colection ! i.e no indexing concept in set

        List<String> windowList=new ArrayList(WindowIds);
        String parentId=windowList.get(0); //parent id
        String childId=windowList.get(1); //child id
        //as we now our driver is still focusing on first window so to switch 
        // it to other window we will need this ids !

        System.out.println(driver.getTitle()); //it will return parent window title 

        //switch to chid window
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle()); //it will return child window title 
        
        //now we will switch back to parent window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle()); //it will return parent window title 






        //Approach 2 (using looping statement)(recommeded when we have many browser windows opened)
        for (String id : WindowIds) {
           String title=driver.switchTo().window(id).getTitle();
           if(title.equals("OrangeHRM"))
           {
            System.out.println(driver.getCurrentUrl());
           }
        }
        
        driver.quit();
    }
}
