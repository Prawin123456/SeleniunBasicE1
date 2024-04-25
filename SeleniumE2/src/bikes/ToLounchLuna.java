package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLounchLuna {
	@Test(groups = "smoke")
	public void Luna() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bikedekho.com/tvs/xl-100");
				
		Reporter.log("Royal lounched",true);

}
}
