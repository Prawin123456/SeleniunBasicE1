package cars;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLounchWaganR {
	@Test
	public void wagonR() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marutisuzuki.com/wagonr");
		Reporter.log("WagonR are Lounched", true);
		driver.quit();
	}

}
