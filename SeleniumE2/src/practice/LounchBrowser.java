package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowser {

	public static void main(String[] args) throws InterruptedException {
        
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		
	}

}
