package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F/");
        driver.manage().window().maximize();


        WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        Boolean ans=logo.isDisplayed();
        System.out.println(ans);


        WebElement input=driver.findElement(By.xpath("//input[@id='FirstName']"));
        Boolean ans2=input.isEnabled();
        Boolean ans3=logo.isEnabled();
        System.out.println(ans2);
        System.out.println(ans3);//but using it on images etc.. is of no use for us !


        WebElement inputForRadio=driver.findElement(By.xpath("//input[@id='gender-female']"));
        Boolean ans4=inputForRadio.isSelected();
        System.out.println(ans4);
        System.out.println("After selecting radio button");
        inputForRadio.click();
        Boolean ans5=inputForRadio.isSelected();
        System.out.println(ans5);
        


    }   
}
