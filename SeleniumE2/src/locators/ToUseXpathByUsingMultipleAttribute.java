package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByUsingMultipleAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Log in")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@type='text' and @value='Search']")).click();

	}

}
