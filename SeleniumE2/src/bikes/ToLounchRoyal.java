package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLounchRoyal {
	@Test(groups = "regression")
	public void royal() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.royalenfield.com/in/en/home/");
				
		Reporter.log("Royal lounched",true);

}
}
