package advanceSeleniumE3;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	 public WebDriver driver;
	    @BeforeClass
	    public void toLounch() {
	    	driver=new ChromeDriver();
	    	Reporter.log("lounch browser successfully", true);
	    	driver.manage().window().maximize();
	    	Reporter.log("browser got maximize successfully", true);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    }

	    @BeforeMethod
	    public void toLogin() {
	    	driver.get("https://demowebshop.tricentis.com/");
	    	Reporter.log("application open successfully", true);
	    	driver.findElement(By.linkText("Log in")).click();
	    	Reporter.log("login page open successfully", true);
	    	driver.findElement(By.id("Email")).sendKeys("SeleniumE1@gmail.com");
	    	driver.findElement(By.id("Email")).sendKeys("Selenium@123");
	    	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    	
	    	
	    }
	    
	    @AfterMethod
	    public void tologout() {
	    	driver.findElement(By.linkText("Log out")).click();
	    	Reporter.log("application logout successfull", true);
	    }
	    
	    @AfterClass
	    public void toClose() {
	    	
	    	Reporter.log("close successfull", false);
	    	driver.quit();
	    	
	    }
	    
	    

}
