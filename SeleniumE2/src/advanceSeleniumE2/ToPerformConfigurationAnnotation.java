package advanceSeleniumE2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToPerformConfigurationAnnotation {

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Before suite executed", true);
	}

	@AfterSuite
	public void aftersuit() {
		Reporter.log("After suite executed", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before test executed", true);
	}

	@AfterTest
	public void aftertest() {
		Reporter.log("After test executed", true);
	}

	@BeforeClass
	public void beforeclass() {
		Reporter.log("Before class executed", true);
	}

	@AfterClass
	public void afterclass() {
		Reporter.log("after class executed", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method executed", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("After method executed", true);
	}

	@Test
	public void Testcases() {
		Reporter.log("Test cases executed", true);
	}

}
