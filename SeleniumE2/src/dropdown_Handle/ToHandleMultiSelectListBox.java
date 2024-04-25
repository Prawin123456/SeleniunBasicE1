package dropdown_Handle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   
		   
		   driver.get("https://demoapp.skillrary.com/");
		   WebElement multiSelectListBox = driver.findElement(By.id("cars"));
		  
		   
		   //to handle listbox by using select class
		   Select multiselect=new Select(multiSelectListBox);
		   System.out.println(multiselect.isMultiple());
		   
		 
		   //To call the method
		   multiselect.selectByIndex(0);
		   multiselect.selectByValue("99");
		   Thread.sleep(3000);
		   
		 
		   
		 //To deslect
		//   multiselect.deselectByIndex(0);
		//   multiselect.deselectByValue("99");
		   
		   multiselect.deselectAll();//deselect all
		   
		   
		   
		   
		   
		   
		   
	}

}
