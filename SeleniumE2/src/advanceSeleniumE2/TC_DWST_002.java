package advanceSeleniumE2;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWST_002 extends BaseClass {

	String expectedData = "Computers";

	@Test
	public void tochechComputerPage() {
		driver.findElement(By.partialLinkText("Computers")).click();
		// Reporter.log("computer is open", true);
		String actaulData = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		// Reporter.log("book is open", true);

		// This is for Vallidation of TestCases
		if (expectedData.equals(actaulData)) {
			Reporter.log("navigation of computers page success", true);
		} else {
			Reporter.log(" failed navigation of computer page", true);
		}
	}

}
