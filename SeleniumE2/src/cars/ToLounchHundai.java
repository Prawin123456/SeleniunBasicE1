package cars;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLounchHundai {
	@Test
	public void hundai() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyundai.com/");
		Reporter.log("HUNDAI are Lounched", true);
		driver.quit();

}
}
