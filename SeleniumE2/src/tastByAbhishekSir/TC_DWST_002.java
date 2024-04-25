package tastByAbhishekSir;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWST_002 extends BaseClass {
	 
	
	@Test
	public void tocomputer() {
		 driver.findElement(By.partialLinkText("Electronics")).click();
	}

}
