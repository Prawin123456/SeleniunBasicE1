package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	      driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	      driver.findElement(By.id("password")).sendKeys("8757104019");
	      WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
	      
	      //to perform click and hold 
	      Actions action=new Actions(driver);
	      action.clickAndHold(eyeIcon).perform();
	      Thread.sleep(2000);
	      action.release();
	}

}
