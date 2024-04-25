package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIsSelectedWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://demoapp.skillrary.com/");
		  WebElement select = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));
		  System.out.println("before selecting");
		  System.out.println(select.isSelected());
		  System.out.println("after selecting");
		  select.click();
		  System.out.println(select.isSelected());
	}

}
