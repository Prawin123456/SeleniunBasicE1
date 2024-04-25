package vallidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZOMATO_TC_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String expectedUserName="prawinKumar@gmai.com";
    String expectedPassword="Prawin@12345";
    String expectedLoginPageTitle="Create account";
    
    //To Open Browser
    
    WebDriver driver=new ChromeDriver();
    System.out.println("browser launched");
    driver.manage().window().maximize();
    System.out.println("Maximize successfully");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    
    //Enter url
    
    driver.get("https://www.zomato.com/bangalore");
    String actualLoginPage = driver.getTitle();
    if(actualLoginPage.equals(expectedLoginPageTitle)) {
    	System.out.println("open zomato page");
    }
    else {
    	System.out.println("not open");
    }
    
    //Enter username
    WebElement Fullname = driver.findElement(By.xpath("//input[@type='text']"));
    Fullname.clear();
    Fullname.sendKeys(expectedUserName);
    
    
	}

}
