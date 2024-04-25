package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.tripadvisor.in/");
		
		Dimension sizeOfBrowser = driver.manage().window().getSize();
		  System.out.println(sizeOfBrowser);
		
		  driver.manage().window().setSize(new Dimension(500, 500));
		  driver.close();
		  driver.quit();
		  

	}

}
