package webDriverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethod {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
	
		//driver.navigate().to("https://www.skillrary.com/");
		
		//driver.navigate().to(new URL("https://www.skillrary.com/"));
		
		
		driver.get("https://www.skillrary.com/");
		Thread.sleep(2000);
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		
		
		

	

}
}
