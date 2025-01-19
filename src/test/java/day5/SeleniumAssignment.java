// Assignment

// https://testautomationpractice.blogspot.com/

// 1) provide some string search for it
// 2) count number of links
// 3) click on each link using for loop
// 4) get window ID's for every browser window
// 5) close špecific browser window

package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;

public class SeleniumAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();
            // Step 1: Provide some string to search (search box example)
            WebElement searchBox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
            searchBox.sendKeys("Test Automation");
            driver.findElement(By.className("wikipedia-search-button")).click();
            // Wait for results to load (optional sleep for simplicity)
            Thread.sleep(2000);


            // Step 2: Count the number of links on the page
            List<WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
            System.out.println("Number of links on the page: " + links.size());

            // Step 3: Click on each link using a for loop
            for (int i = 0; i < links.size(); i++) {
                links.get(i).click();
            }

            //Step 4:geting window ids
            Set<String> windowHandles = driver.getWindowHandles();
            String mainWindow = driver.getWindowHandle();
            for (String windowID : windowHandles) {
                // Step 5: Close a specific browser window
                // Assuming we want to close a specific window (e.g., the child windows opened)
                if (!windowID.equals(mainWindow)) {
                    driver.switchTo().window(windowID);
                    System.out.println("Closing window with title: " + driver.getTitle());
                    driver.close();
                }
            }
    }
}
