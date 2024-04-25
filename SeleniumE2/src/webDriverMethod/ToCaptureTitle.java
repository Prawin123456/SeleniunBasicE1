package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitle {

	public static void main(String[] args) throws InterruptedException {
	  ChromeDriver driver=new ChromeDriver();//to lounch the browser
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	  driver.get("https://www.instagram.com/");
	  //to open instagram
	  Thread.sleep(2000);  //2 sec timing to open
	  String titleOfWebpage = driver.getTitle();//capture title
	  System.out.println(titleOfWebpage);

	}

}
