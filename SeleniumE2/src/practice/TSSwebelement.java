package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TSSwebelement {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
        
         driver.get("https://www.sarkariresult.com/");
         Thread.sleep(2000);
         
          File temp = driver.findElement(By.id("//div[@align='center']")).getScreenshotAs(OutputType.FILE);
          File src=new File("./youtube/image9.png");
          FileHandler.copy(temp, src);
         
	}

}
