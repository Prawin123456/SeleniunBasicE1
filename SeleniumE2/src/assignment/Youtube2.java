package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           ChromeDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           Thread.sleep(500);
           driver.get("https://www.youtube.com/");
           Thread.sleep(500);
           driver.findElement(By.name("search_query")).sendKeys("ki tui bol");
           Thread.sleep(500);
           driver.findElement(By.id("search-icon-legacy")).click();
           Thread.sleep(500);
           driver.findElement(By.linkText("Ke Tui Bol | Herogiri | Dev | Sayantika | Arijit Singh | Jeet Gannguli")).click();

	}

}
