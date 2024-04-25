package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TopPerformFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("https://www.naukri.com/registration/createAccount");
		
		//To perform action 
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(By.xpath("//p[contains(text(),'I have work experience (excluding internships)')]")).click();
		//here we part of content only one word than it show 1 of 1
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\admin\\Desktop\\CHNDU.pdf");
		
		
		
		
	
		 
	}

}
