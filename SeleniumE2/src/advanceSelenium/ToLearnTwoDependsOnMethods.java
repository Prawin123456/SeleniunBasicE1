package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTwoDependsOnMethods {

	@Test
	public void createdAccount() {
		Reporter.log("account created",true);
		
	}
	@Test
	public void editeddAccount() {
		Reporter.log("account edited",true);
		

}
	@Test(dependsOnMethods = {"editeddAccount","createdAccount"})
	public void deleteddAccount() {
		Reporter.log("account deleted",true);
	

	}

}
