package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLounchKTM {
	@Test(groups = "regression")
	public void ktm() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/ktm-bikes/");
	    Reporter.log("Royal lounched",true);

}
}
