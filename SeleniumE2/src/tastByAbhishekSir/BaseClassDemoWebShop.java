package tastByAbhishekSir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 
		 driver.findElement(By.linkText("Log in")).click();
	//	 driver.findElement(By.linkText("Register")).click();
		 
		 driver.findElement(By.id("Email")).sendKeys("SeleniumE1@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Books")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.findElement(By.partialLinkText("Electronics")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.findElement(By.partialLinkText("Computers")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Digital downloads")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Jewelry")).click();
		 driver.findElement(By.partialLinkText("Gift Cards")).click();
		 driver.quit();
		 
		 
		 
	        
		 
		 
		 
		 
        
	}

}
