  package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        
	        driver.get("https://www.shoppersstack.com/");
	        driver.findElement(By.id("loginBtn")).click();
	        
	        driver.findElement(By.id("Email")).sendKeys("babu@gmail.com");
	        driver.findElement(By.id("Password")).sendKeys("babu@123");
	        
	        
	        
	        
	        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("Login")));
	        
	        driver.findElement(By.linkText("Login")).click();
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        }

}
