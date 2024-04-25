package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           WebDriver driver=new ChromeDriver();//Upcasting use here for cross browser
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.woodenstreet.com/");
		  
		 for(;;) {
			 try {
				 driver.findElement(By.id("loginclose1")).click();//popup closed when it will come
				 break;
			 }
			 catch(Exception e){
				 Thread.sleep(2000);
			 }
		 }
		  List<WebElement> Element = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
		  for(WebElement e:Element) {
			 System.out.println(e.getText());//To capture all menu element present in web page
			 
		 }
	}

}
