package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTestCase {
    public static void main(String[] args) {
        System.out.println("hello");
        System.setProperty("webdriver.chrome.driver", "D:\\Webdriverautomation_manual\\Selenium\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.com");
            System.out.println("Page Title: " + driver.getTitle());
        } finally {
            driver.quit();
        }
    }
}
