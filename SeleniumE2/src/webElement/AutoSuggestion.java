package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
  
   Thread.sleep(2000);
   driver.get("https://www.amazon.in/");
   Thread.sleep(2000);
   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
   Thread.sleep(2000);
   List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div[1]/div"));
   for(WebElement ele:suggestion) {
	   System.out.println(ele.getText());//print all the menu text which is available in the web page
      }
   
   }

}
