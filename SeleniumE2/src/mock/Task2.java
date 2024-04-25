package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.vtiger.com/");
		driver.findElement(By.partialLinkText("Resources")).click();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		driver.findElement(By.id("header_contact")).click();
		driver.findElement(By.id("Bengaluru, India"));
		driver.findElement(By.partialLinkText("+91 9243602352")).getText();
		driver.quit();
	}

}
