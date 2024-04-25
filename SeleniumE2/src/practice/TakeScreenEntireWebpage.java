package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenEntireWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
         
          driver.get("https://www.youtube.com/watch?v=BUeaW5DPp4Q");
          Thread.sleep(2000);
          
          
          TakesScreenshot ts=(TakesScreenshot) driver;
           File temp = ts.getScreenshotAs(OutputType.FILE);
           File src=new File("./errorShots/image8.png");
           FileHandler.copy(temp, src);
          
	}

}
