package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetMethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();//to lounch empty browser//starts server
		driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/login/");
		driver.get("https://www.oyorooms.com/");

	}

}
