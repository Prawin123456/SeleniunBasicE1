package tastByAbhishekSir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	 public WebDriver driver;
     @BeforeClass
     public void toLounch() {
     driver=new ChromeDriver();
     Reporter.log("Browser got lounched successfully", true);
     driver.manage().window().maximize();
     Reporter.log("Browser got maximize successfully", true);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

}
     
     @BeforeMethod
     
     public void tologin() {
   	  driver.get("https://demowebshop.tricentis.com/");
   	  driver.findElement(By.linkText("Log in")).click();
   	  driver.findElement(By.id("Email")).sendKeys("SeleniumE1@gmail.com");
   	  driver.findElement(By.id("Password")).sendKeys("Selenium@123");
   	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
   	  Reporter.log("Navigated successfully to homepage", true);
}
 
     
     @AfterMethod
     
     public void tologout() {
   	  driver.findElement(By.linkText("Log out")).click();
   	  Reporter.log("logout successfull", true);
}
     
     @AfterClass
     public void toClose() {
   	  
   	  Reporter.log("close successfullyy", true);
   	  driver.quit();    
     
     }
}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
