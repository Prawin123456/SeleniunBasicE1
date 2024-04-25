package vallidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_AMAZON_LOGIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String expectedusername="prawin@gmail.com";
    String expectedpassword="123456789";
    String expectedLoginpageTitle="submit";
    
  //  Step 1:- To start browser
    WebDriver driver=new ChromeDriver();
    System.out.println("Browser got launched successfully");
    driver.manage().window().maximize();
    System.out.println("Browser got maximize successfully");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    
    
    //Step:-Launch the Browser
    driver.get("https://www.instagram.com/");
    String actualLoginPageTitle = driver.getTitle();
    if(actualLoginPageTitle.equals(expectedLoginpageTitle)) {
    	System.out.println("Successfully navigate to insta page");
    }
    else {
    	System.out.println("failed to navigate to insta page");
    }
    
    //Step:-3  Enter the username
    
    WebElement UsernameTextField = driver.findElement(By.name("username"));
    UsernameTextField.clear();
    UsernameTextField.sendKeys(expectedusername);
   String actualUsername = UsernameTextField.getAttribute("value");
   if(actualUsername.equals(expectedusername)) {
	   System.out.println("Username textfield accepted");
   }
   else {
	   System.out.println("Username textField not accepted");
   }
    
   //Step:-4  Enter password
   
   WebElement passwordTextField = driver.findElement(By.name("password"));
   passwordTextField.clear();
   passwordTextField.sendKeys(expectedpassword);
   String actualpassword = passwordTextField.getAttribute("value");
   if(actualpassword.equals(expectedpassword)) {
	   System.out.println("PasswordTextField accepted");
   }
   else {
	   System.out.println("password textfield not accepted");
   }
   
   
   //To cline button
   
   WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    
   LoginButton.click();
   System.out.println("HomePage should displayed");
   
   //To close the browser
   System.out.println("Browser got closed successfully");
   driver.quit();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
