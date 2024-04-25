package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShotsOfwebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.udemy.com/");
		Thread.sleep(2000);
		 
		 
	  
		File temp =driver.findElement(By.xpath("//img[@alt='Udemy' and @ loading='lazy']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/logoUdemy.jpeg");
		FileHandler.copy(temp, src);
	}

}
