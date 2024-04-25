package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncronisationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
             WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             
             //To declare implicit wait
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
             
             driver.get("http://localhost:8888/");
            
             
             driver.findElement(By.name("user_name")).sendKeys("admin");
             Thread.sleep(2000);
             driver.findElement(By.name("user_password")).sendKeys("password");
             Thread.sleep(2000);
                       
             //To declare explicit wait
             
             WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
             wait.until(ExpectedConditions.elementToBeSelected(By.id("submitButton")));
             
             driver.findElement(By.id("submitButton")).click();
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             driver.quit();
             
             
             
             

	}

}
