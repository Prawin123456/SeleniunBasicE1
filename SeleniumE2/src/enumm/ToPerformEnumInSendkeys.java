package enumm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformEnumInSendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		
		//To perform keyboard action
		
		 WebElement UserName = driver.findElement(By.name("username"));
		 UserName.sendKeys("prawin",Keys.CONTROL+"a");
		 UserName.sendKeys(Keys.CONTROL+"c");
		 WebElement Userpwd = driver.findElement(By.name("password"));
		 Userpwd.sendKeys(Keys.CONTROL+"v");
		

	}

}
