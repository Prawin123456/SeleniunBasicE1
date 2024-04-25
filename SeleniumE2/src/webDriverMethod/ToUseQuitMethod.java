package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseQuitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.instagram.com/");
		  Thread.sleep(2000);
		 // driver.close();
		  driver.quit();
	}

}
