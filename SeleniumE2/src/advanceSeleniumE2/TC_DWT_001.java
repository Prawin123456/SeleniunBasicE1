package advanceSeleniumE2;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWT_001 extends BaseClass {

	String expectedData = "Books";

	@Test
	public void tocheckBook() {
		driver.findElement(By.partialLinkText("Books")).click();
		String actaulData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
	 // Reporter.log("book is open", true);

		// This is for Vallidation of TestCases
		if (expectedData.equals(actaulData)) {
			Reporter.log("navigation of book page success", true);
		} else {
			Reporter.log(" failed navigation of book page", true);
		}
	}
}