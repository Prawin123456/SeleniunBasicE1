package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
            ChromeDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            
            driver.get("https://www.amazon.in/");
            Thread.sleep(2000);
            
          File temp = driver.findElement(By.id("nav-cart")).getScreenshotAs(OutputType.FILE);
          File src=new File("./errorShots/12.png");
          FileHandler.copy(temp, src);
            
            
	}

}
