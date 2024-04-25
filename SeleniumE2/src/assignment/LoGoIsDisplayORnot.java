package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoGoIsDisplayORnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		boolean Element = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if (Element == true) {
			System.out.println("logo is displayed");
		} else {
			System.out.println("logo is not displayed");
		}
	}

}
