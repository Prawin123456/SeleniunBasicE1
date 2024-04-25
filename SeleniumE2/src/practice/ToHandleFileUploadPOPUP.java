package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPOPUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.naukri.com/registration/createAccount");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.DOWN).perform();
		//action.sendKeys(Keys.DOWN).perform();
		
		driver.findElement(By.xpath("//p[contains(text(),'I have work experience (excluding internships)')]")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\admin\\Desktop\\CHNDU.PDF");
		
		
	}

}
