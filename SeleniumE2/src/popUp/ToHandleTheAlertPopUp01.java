package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleTheAlertPopUp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		// To switch frame

		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();

		// To handle

		Alert alertpopup = driver.switchTo().alert();
		System.out.println(alertpopup.getText());
		// alertpopup.accept();
		alertpopup.dismiss();//both works same for popup
	}

}
