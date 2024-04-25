package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://www.instagram.com/");
		   Rectangle rect = driver.findElement(By.xpath("//button[@type='submit']")).getRect();
		  System.out.println(rect.getHeight());
		  System.out.println(rect.getHeight());//this for individually we can access hight, width and X,Y coordinate symmultaneously
		  System.out.println(rect.getX());
		  System.out.println(rect.getY());
	}

}
