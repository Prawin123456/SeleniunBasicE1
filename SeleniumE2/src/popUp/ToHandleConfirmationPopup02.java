package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopup02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://licindia.in/");
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.partialLinkText("Login")).click();
		
		//To handle
		
		
		Alert ConfirmationPopup = driver.switchTo().alert();
		System.out.println(ConfirmationPopup.getText());
	//	ConfirmationPopup.accept();//This will click OK button
		ConfirmationPopup.dismiss();//This will click on CANCEL button
	}

}
