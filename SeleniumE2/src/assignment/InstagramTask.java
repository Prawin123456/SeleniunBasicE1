package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Syncronisation
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.instagram.com/");
  driver.findElement(By.name("username")).sendKeys("8757104019");
  driver.findElement(By.name("password")).sendKeys("9334038927");//noSuchElement exception
  //To ignore thread.sleep we use use syncronisation
  //it has three method
  //1>.implicit
  //2>.explicit
  //3>.fluent
  //for machting the speed of selenium and application speed is known as syncronisation.
	}

}
