package dropdown_Handle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11passtheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.dream11.com/");

		// To Switch using index
		// driver.switchTo().frame(0);

		// To Switch using id or name
		// driver.switchTo().frame("send-sms-iframe")//This is id

		// To switch by using webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);

		driver.findElement(By.id("regEmail")).sendKeys("8757104019");

		// Switch to back
		
		// driver.switchTo().parentFrame();//parentFrame()
		driver.switchTo().defaultContent();//DefaultFrame()
		driver.findElement(By.linkText("About Us")).click();

		
		// driver.quit();
	}

}
