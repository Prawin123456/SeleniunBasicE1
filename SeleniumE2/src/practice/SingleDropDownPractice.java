package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDownPractice {

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
        driver.findElement(By.id("submitButton")).click();
        
        //To use Single dropdown handle
        
        WebElement quickdropdown = driver.findElement(By.id("qccombo"));
        
        //To handle dropdown by Select class
        Select quickbutton=new Select(quickdropdown);
       
        //To call the method
        quickbutton.selectByValue("Accounts");
        
        Thread.sleep(3000);
        driver.quit();
        
        
        
        
        
	}

}
