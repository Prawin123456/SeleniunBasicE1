package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
 
 driver.get("http://localhost:8888/");
 
 
 //To take screenShot of webelement
 
        File temp = driver.findElement(By.xpath("//img[@alt='vtiger iPhone Application']")).getScreenshotAs(OutputType.FILE);
        File src = new File("./errorShots/i2.png");
        FileHandler.copy(temp, src);
	}

}
