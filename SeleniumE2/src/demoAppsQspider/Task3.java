package demoAppsQspider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        
        driver.findElement(By.id("name")).sendKeys("prawin");
        driver.findElement(By.id("email")).sendKeys("prawinkumar@gmail.com");
        
        driver.findElement(By.id("password")).sendKeys("Prawin@123");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
	}

}
