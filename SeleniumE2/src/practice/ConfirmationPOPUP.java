package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPOPUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://licindia.in/");

		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.partialLinkText("Login")).click();
		
		//To handle confirmation popup
		
		Alert confirmationpopup = driver.switchTo().alert();
		confirmationpopup.accept();//for OK button
	
		confirmationpopup.dismiss();//for Cancel button
		driver.quit();
		
	
	}

}
