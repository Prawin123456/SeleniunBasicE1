package advanceSeleniumE2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	
	@DataProvider(name="cred")
	public String[][] tosendData() {
		String sarr[][]= {
				      
				{"abh@gmail.com","abhi@123"},
				{"siva@gmail.com","siva@123"},
				{"kiran@gmail.com","kiran@123"}
		                 };
		return sarr;
				
		}
	
	
	@Test(dataProvider="cred")
		public void login(String username,String password) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(username);
		driver.quit();
			
		}
	}
		
	

