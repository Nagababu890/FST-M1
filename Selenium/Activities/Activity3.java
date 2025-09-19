package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://training-support.net/webelements/login-form");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the username and password fields and enter values
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Wait until the confirmation message is visible (h2 containing Success or Failure)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Success') or contains(text(), 'Invalid')]")));

        // Print the confirmation message
        String message = driver.findElement(By.xpath("//h2[contains(text(), 'Success') or contains(text(), 'Invalid')]")).getText();
        System.out.println(message);

        // Close the browser
        driver.quit();
    }
}
