package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TouseTagnameofWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 
		 driver.get("https://www.actitime.com/");
		 Thread.sleep(2000);
		 WebElement tryFreeButton = driver.findElement(By.linkText("Try Free"));
		 System.out.println(tryFreeButton.getTagName());
	}

}
