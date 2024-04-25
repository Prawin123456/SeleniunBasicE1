package syncronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopperstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://www.shoppersstack.com/products_page/7");
		driver.findElement(By.name("Check Delivery")).sendKeys("560011");
		driver.findElement(By.name("Check")).click();//ECIE
		
	}

}
