package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("Odiyamma Song");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("HI PAPA :Odiyamma (Full Video) | Nani | Shruti Haasan | Dhruv | Shouryuv | Hesham Abdul Wahab")).click();
	     Thread.sleep(300000);
	    driver.quit();
	}

}
