package cars;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLounchMarutiSuzukiCar {
	@Test
	public void SUZUKI () {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marutisuzuki.com/");
		Reporter.log("SUZUKI are Lounched", true);
		driver.quit();
	}

}
