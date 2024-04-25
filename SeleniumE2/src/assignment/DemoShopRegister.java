package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShopRegister {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	
		driver.findElement(By.linkText("Register")).click();
		
		
		WebElement maleRadioBtn = driver.findElement (By.id("gender-male"));
		maleRadioBtn.click();
		
		
		driver.findElement(By.name("FirstName")).sendKeys("Prawin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("LastName")).sendKeys("Kumar");
		Thread.sleep(2000);
	
		driver.findElement(By.name("Email")).sendKeys("prawinkumar.222@gmail.com");
	     Thread.sleep(2000);
	
		driver.findElement(By.name("Password")).sendKeys("Prawin@1995");
	    Thread.sleep(2000);

		driver.findElement(By.name("ConfirmPassword")).sendKeys("Prawin@1995");
	    Thread.sleep(2000);
		driver.findElement(By.name("register-button")).click();
		driver.quit();
		
		
		
		
		

	}

}
