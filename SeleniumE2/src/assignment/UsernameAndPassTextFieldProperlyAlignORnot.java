package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsernameAndPassTextFieldProperlyAlignORnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		 WebElement username = driver.findElement(By.id("email"));
		 WebElement password = driver.findElement(By.id("email"));
		 
		 Actions action=new Actions(driver);
		 
		
		if (username==password) {
			System.out.println("logo is displayed");
		} else {
			System.out.println("logo is not displayed");
		}
	}

}
