package dropdown_Handle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoshopBookAssignmentUsingSigleSelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            
            
            driver.get("https://demowebshop.tricentis.com/books");
            
            WebElement products = driver.findElement(By.id("products-orderby"));
            
            //to handle dropdown
            Select newproduct=new Select(products);
            //to call the method
            newproduct.selectByVisibleText("Price: Low to High");
            
            
	}

}
