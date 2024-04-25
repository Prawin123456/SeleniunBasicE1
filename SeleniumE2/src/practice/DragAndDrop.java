package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		
		
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		
		
		WebElement gallery = driver.findElement(By.id("gallery"));
		WebElement trashbox = driver.findElement(By.id("trash"));
		
		
		
		Actions action =new Actions(driver);
		action.dragAndDrop(image1, trashbox).perform();
		action.dragAndDrop(image2, trashbox).perform();
		action.dragAndDrop(image3, trashbox).perform();
		action.dragAndDrop(image4, trashbox).perform();
		
		
		
		Thread.sleep(2000);
		
		
		action.dragAndDrop(gallery,image1 ).perform();
		action.dragAndDrop(gallery,image2 ).perform();
		action.dragAndDrop(gallery,image3 ).perform();
		action.dragAndDrop(gallery,image4 ).perform();
		
		
		
		
		
		
	}

}
