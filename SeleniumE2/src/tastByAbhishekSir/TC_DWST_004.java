package tastByAbhishekSir;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWST_004 extends BaseClass {
	@Test
	public void toElectronics() {
		driver.findElement(By.partialLinkText("Computers")).click();

}
}
