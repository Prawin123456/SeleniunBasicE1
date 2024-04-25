package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://baskinrobbinsindia.com/");
 String urlOfWebpage = driver.getCurrentUrl();
 System.out.println(urlOfWebpage);
	}

}
