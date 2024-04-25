package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLounchNinja {
	@Test(groups = "regression")
	public void ninja() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/kawasaki-bikes/ninja/");
				
		Reporter.log("Royal lounched",true);

}
}
