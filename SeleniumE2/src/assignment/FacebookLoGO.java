package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoGO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 
 
 driver.get("https://www.facebook.com/");
 
 WebElement Element = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
 Thread.sleep(2000);
 System.out.println(Element.isDisplayed());
 
 
	}

}
