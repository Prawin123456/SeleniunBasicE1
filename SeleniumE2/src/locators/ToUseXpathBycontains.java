package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathBycontains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();//start server
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");//open demoshop
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Log in")).click();//login link
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();//login button
		 Thread.sleep(2000);
		 WebElement errormsg = driver.findElement(By.xpath("//span[contains(text(),'Please')]"));//capture error message
		 System.out.println(errormsg);
	}

}
