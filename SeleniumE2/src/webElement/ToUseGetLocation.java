package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://www.instagram.com/");
		   Point sizeofwebElement = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
		  System.out.println(sizeofwebElement);
		  System.out.println(sizeofwebElement.getX());//this for individually we can access X and Y coordinate
		  System.out.println(sizeofwebElement.getY());
	}

}
