package ProjectActivity;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectActivity7 {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co:8080/orangehrm");   
        driver.manage().window().maximize();

        System.out.println("🔑 Logging in...");
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        System.out.println("✅ Login successful!");
    }

    @Test
    public void addQualificationTest() throws InterruptedException {
        System.out.println("➡️ Navigating to My Info...");
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        Thread.sleep(2000);

        System.out.println("➡️ Opening Qualifications tab...");
        driver.findElement(By.linkText("Qualifications")).click();
        Thread.sleep(2000);

        System.out.println("✍️ Adding Work Experience...");
        driver.findElement(By.id("addWorkExperience")).click();
        Thread.sleep(1000);

        WebElement company = driver.findElement(By.id("experience_employer"));
        WebElement jobTitle = driver.findElement(By.id("experience_jobtitle"));

        company.sendKeys("OpenAI");
        jobTitle.sendKeys("Software Engineer");

        driver.findElement(By.id("btnWorkExpSave")).click();
        Thread.sleep(2000);

        System.out.println("✅ Work experience added successfully!");
    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
        System.out.println("🚀 Browser closed successfully.");
    }
}
