package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom1 {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Welcome wp = new Welcome(driver);
		wp.getLoginlink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextFild().sendKeys("dheeraj147@gmail.com");
		lp.getPasswordTextFild().sendKeys("Dheeraj147");
		lp.getLoginVutton().click();
		driver.quit();
			
	}

}
