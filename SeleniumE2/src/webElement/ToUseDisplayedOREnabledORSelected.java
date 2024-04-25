package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseDisplayedOREnabledORSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://www.instagram.com/");
		  WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		  System.out.println("before entering the data");
		  System.out.println(LoginButton.isDisplayed());
		  System.out.println(LoginButton.isEnabled());
		  System.out.println("=============================================");
		  System.out.println("Aftre entering the data");
		  driver.findElement(By.name("username")).sendKeys("prawinkumar");
		  Thread.sleep(2000);
		  driver.findElement(By.name("password")).sendKeys("1234567");
		  Thread.sleep(2000);
		  System.out.println(LoginButton.isDisplayed());
		  System.out.println(LoginButton.isEnabled());
		 
		  
	}

}
