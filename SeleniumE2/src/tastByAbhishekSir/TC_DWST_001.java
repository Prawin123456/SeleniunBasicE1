package tastByAbhishekSir;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWST_001 extends BaseClass{
	
	

	@Test
	public void tocheckBook() {
		
		driver.findElement(By.partialLinkText("Books")).click();
		

		}
	}


