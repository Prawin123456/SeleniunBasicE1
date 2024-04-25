package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 
		 driver.get("https://demo.vtiger.com/vtigercrm/  ");
		 Thread.sleep(2000);
		WebElement Usernametextfield = driver.findElement(By.id("username"));
		Usernametextfield.clear();
		WebElement passwordtextfield = driver.findElement(By.id("username"));
		passwordtextfield.clear();
		driver.findElement(By.id("username")).sendKeys("prawin");
		driver.findElement(By.id("password")).sendKeys("789456");
		
		 
	}

}
