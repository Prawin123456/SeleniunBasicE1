package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureMsgByUsingXpathContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Register")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Register']")).click();//login button
		 Thread.sleep(2000);
		 WebElement error1 = driver.findElement(By.xpath("//span[contains(@for,'FirstName ')]"));//capture error message
		 System.out.println(error1);
		 WebElement error2 = driver.findElement(By.xpath("//span[contains(@for,'LastName')]"));//capture error message
		 System.out.println(error2);
		 WebElement error3 = driver.findElement(By.xpath("//span[contains(@for,'Email')]"));//capture error message
		 System.out.println(error3);
		 WebElement error4 = driver.findElement(By.xpath("//span[contains(@for,'Password')]"));//capture error message
		 System.out.println(error4);
		 
	}

}
