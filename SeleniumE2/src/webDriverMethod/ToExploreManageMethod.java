package webDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.skillrary.com/");
		  Thread.sleep(2000);
		  
		  //To maximize the browser
		 // driver.manage().window().maximize();
		//  Thread.sleep(2000);
		 
		 
		  //To minimize the browser
		 // driver.manage().window().minimize();
		 // Thread.sleep(2000);
		 
		
		 
		  //To fullScreen the browser
		 // driver.manage().window().fullscreen();
		 
		
		
		  //To get the size
		//  Dimension sizeOfBrowser = driver.manage().window().getSize();
		  //System.out.println(sizeOfBrowser);
		  
		  
		 
		  //To set the size of browser
		  //First method to set the size
		 //driver.manage().window().setSize(new Dimension(200, 400));
		  //second method for setSize
		 // Dimension d=new Dimension(700, 600);
		  //driver.manage().window().setSize(d);
		  
		 
		  
		  //To get position
		 // Point pos = driver.manage().window().getPosition();
		//  System.out.println(pos);
		
		  
		  //To set position
		 // driver.manage().window().setPosition(new Point(200, 100));
		  
		  //2nd method for set the position
		 //  Point sop = new Dimension(200, 100);
		 // driver.manage().window().setPosition(sop);
		  
		  
		  
	}

}
