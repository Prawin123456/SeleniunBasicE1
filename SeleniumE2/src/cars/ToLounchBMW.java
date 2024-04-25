package cars;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLounchBMW {
	@Test
	public void BMW() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.carwale.com/bmw-cars/");
		Reporter.log("BMW are Lounched", true);
		driver.quit();
	}
}
