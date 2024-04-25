package demoAppsQspider;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.amazon.in/");

		// To capture Parent Id
		String parentid = driver.getWindowHandle();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");

		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 Pro Max (256 GB) - Black Titanium'])[1]")).click();

		Set<String> allId = driver.getWindowHandles();
		allId.remove(parentid);

		for (String id : allId) {

			driver.switchTo().window(id);

			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File src = new File("./errorShots/AMAzon222.jpeg");
			FileHandler.copy(temp, src);
		}

		
	}

}
