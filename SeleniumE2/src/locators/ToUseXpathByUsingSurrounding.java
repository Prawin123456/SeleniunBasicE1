package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByUsingSurrounding {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");//xpath by using dependent and independent xpath and xpath by surrounding
		Thread.sleep(1000);                                                 //it has 4 rule.<1>
		driver.findElement(By.linkText("Login")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//button[text()='loginBtn']")).click();
	//	driver.findElement(By.name("Email")).sendKeys("babu@gmail.com");
	//	Thread.sleep(1000);
	//	driver.findElement(By.name("Password")).sendKeys("Babu@123");
	//	Thread.sleep(1000);
	//	driver.findElement(By.id("loginBtn")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.id("men")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("Levis Mens Regular Fit Tee")).click();
		

	}

}
