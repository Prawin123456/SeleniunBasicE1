package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot2 {

	public static void main(String[] args) throws IOException, InterruptedException {
              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.get("https://upsc.gov.in/");
              Thread.sleep(2000);
              File temp = driver.findElement(By.partialLinkText("UNION PUBLIC SERVICE COMMISSION")).getScreenshotAs(OutputType.FILE);
              File src=new File("./errorShots/2.png");
              FileHandler.copy(temp, src);
	}

}
