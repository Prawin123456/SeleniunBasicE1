package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLounchjawa {
	@Test(groups = "smoke")
	public void jawa() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/jawa-bikes/");
				
		Reporter.log("Royal lounched",true);

}
}
