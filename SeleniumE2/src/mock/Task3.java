package mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.zomato.com/");
		
		File temp =driver.findElement(By.xpath("//img[@role='presentation']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/logoZomato.jpeg");
		FileHandler.copy(temp, src);
	}

}
