package mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.partialLinkText("Sofa Sets")).click();
		driver.findElement(By.xpath("//img[@alt='Berlin 3 Seater Fabric Sofa Design latest']")).click();
		
	    WebElement select = driver.findElement(By.xpath("//a[@id='button-cart-buy-now']"));
		System.out.println(select.isSelected());
		
		
		 
		
		
	}

}
