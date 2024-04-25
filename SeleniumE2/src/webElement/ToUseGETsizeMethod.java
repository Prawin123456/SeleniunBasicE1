package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGETsizeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  ChromeDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  Thread.sleep(2000);
  driver.get("https://www.instagram.com/");
  Dimension sizeofwebElement = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
  System.out.println(sizeofwebElement);
  System.out.println(sizeofwebElement.getHeight());//this for individually we can access hight and width
  System.out.println(sizeofwebElement.getWidth());
	}

}
