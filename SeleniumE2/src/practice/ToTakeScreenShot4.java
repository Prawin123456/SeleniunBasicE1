package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShot4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
     //To open the browser and start the server
     driver.get("http://localhost:8888/");
     
     //To take ScreenShot of entire webpage
     TakesScreenshot ts=(TakesScreenshot) driver;
      File temp = ts.getScreenshotAs(OutputType.FILE);
      File src=new File("./errorShots/i1.jpeg");
      FileHandler.copy(temp, src);
      driver.quit();
     
	}

}
