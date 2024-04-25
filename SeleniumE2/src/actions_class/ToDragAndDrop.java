package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		// To identify images

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);

		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		WebElement trashbox = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));

		// to perform action class
		
		Actions action = new Actions(driver);

		// To gallery to trash

		action.dragAndDrop(image1, trashbox).perform();
		Thread.sleep(2000);
		// action.dragAndDrop(image2, trashbox).perform();

		// To perform moveByoffset
		action.dragAndDropBy(image2, 400, 0);
        Thread.sleep(2000);
		// action.dragAndDrop(image3, trashbox).perform();
		// To perform drag and drop
		action.moveByOffset(400, 0);
		Thread.sleep(2000);
		action.dragAndDrop(image4, trashbox).perform();
		Thread.sleep(2000);

		// To trash to gallery
		action.dragAndDrop(image1, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, gallery).perform();
		Thread.sleep(2000);

	}

}
