package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseidLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("prawin@gmail.com");
	
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("prawin@1996567");
		driver.quit();

	}

}
