package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

		    @Test
			public void cricbuzz() {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.cricbuzz.com/");
				Reporter.log("Cricbuzz got executed",true);
				driver.quit();
			}
		    
		    @Test
		  	public void baskinRobbins() {
		    	WebDriver driver=new ChromeDriver();
				driver.get("https://baskinrobbinsindia.com/");
				Reporter.log("baskin got executed",true);
				driver.quit();
		    	
			}
		    @Test
			public void amazon() {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				Reporter.log("baskin got executed",true);
				driver.quit();
				
	}


}
