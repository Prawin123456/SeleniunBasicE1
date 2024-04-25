package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementToFindErroeColor {

	public static void main(String[] args) throws InterruptedException {
           ChromeDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           Thread.sleep(2000);
           
           
           driver.get("https://demowebshop.tricentis.com/");
           Thread.sleep(2000);
           
           driver.findElement(By.linkText("Log in")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@value='Log in']")).click();
           Thread.sleep(1000);
           WebElement loginButton = driver.findElement(By.partialLinkText("Login was unsuccessful"));
  		   System.out.println(loginButton.getCssValue("color"));
          
	}

}
