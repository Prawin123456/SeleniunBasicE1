package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.worldwildlife.org/");
	Thread.sleep(2000);
	
	String tileofwebpage = driver.getTitle();
	System.out.println( tileofwebpage);
	
	driver.close();

	  
	}

}
