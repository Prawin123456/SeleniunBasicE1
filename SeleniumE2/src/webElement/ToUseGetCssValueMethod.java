package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetCssValueMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 
		 driver.get("https://www.actitime.com/");
		 Thread.sleep(2000);
		 WebElement tryFreeButton = driver.findElement(By.linkText("Try Free"));
		 System.out.println(tryFreeButton.getCssValue("font-size"));
		 System.out.println(tryFreeButton.getCssValue("background-color"));
		 System.out.println(tryFreeButton.getCssValue("border-radius"));
		 System.out.println(tryFreeButton.getCssValue("max-width"));
	}

}
