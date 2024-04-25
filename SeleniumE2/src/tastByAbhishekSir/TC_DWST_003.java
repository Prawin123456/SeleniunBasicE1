package tastByAbhishekSir;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWST_003 extends BaseClass {
	
	@Test
	public void toElectronics() {
		 driver.findElement(By.partialLinkText("Electronics")).click();

}
}
