package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
   public static void main(String[] args) {
	   WebDriver driver = new FirefoxDriver();
	   driver.get("https://training-support.net");
	   System.out.println("page title :" + driver.getTitle());
	   
	   //find the link and click
	   driver.findElement(By.linkText("About Us")).click();
	   //New page open
	   System.out.println("New page title :" + driver.getTitle());
	   
	   driver.quit();
	   
   }

  
	
   }


