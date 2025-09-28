package ProjectActivity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity9 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws Exception {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step a: Open OrangeHRM page
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
        Thread.sleep(1000);

        // Login
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(1000);
    }

    @Test
    public void emergencyContactsTest() throws Exception {
        // Step b: Navigate to My Info
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        Thread.sleep(1000);

        // Step d: Click Emergency Contacts
        driver.findElement(By.linkText("Emergency Contacts")).click();
        Thread.sleep(1000);

        // Step e: Retrieve all contact info from table
        WebElement table = driver.findElement(By.id("emgcontact_list"));
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        // Step f: Print all contact info
        System.out.println("===== Emergency Contacts =====");
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + " | ");
            }
            System.out.println();
        }

        // Confirmation message removed because it doesn't exist on this page
        System.out.println("✅ Emergency contacts printed successfully.");
    }

    @AfterClass
    public void afterClass() throws Exception {
        // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
}
