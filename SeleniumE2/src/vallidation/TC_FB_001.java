   package vallidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FB_001 {

	public static void main(String[] args) {
      String expectedUsername="prawinkumar@gmail.com";
      String expectedPasword="Prawin@1995";
      String expectedLoginPageTitle="Facebook – log in or sign up";
      
      //Step 1:- Open the Browser
      
      WebDriver driver=new ChromeDriver();
      System.out.println("Browser got Launched successfully");
      driver.manage().window().maximize();
      System.out.println("Browser got maximized successfully");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      //Step 2:- Enter the URL
      driver.get("https://www.facebook.com/");
      String actualLoginPageTitle = driver.getTitle();
      if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
    	  System.out.println("Successfully navigate to facebook login page");
      }
      else {
    	  System.out.println("Failed to navigate login page");
      }
      
      // Step:-3  Enter the USERNAME
      
      WebElement usernameTextField = driver.findElement(By.id("email"));
      usernameTextField.clear();
      usernameTextField.sendKeys(expectedUsername);
      String actualUsername = usernameTextField.getAttribute("value");
      if(actualUsername.equals(expectedUsername)) {
    	  System.out.println("UsernameTextField accepted data");
      }
      else {
    	  System.out.println("UsernameTextField not accepted data");
      }
      //Step:-4 Enter the Password
      
      WebElement passwordTextField = driver.findElement(By.name("pass"));
      passwordTextField.clear();
      passwordTextField.sendKeys(expectedPasword);
      String actualpassword = passwordTextField.getAttribute("value");
      if(actualpassword.equals(expectedPasword)) {
    	  System.out.println("PasswordTextField accepted data");
      }
      else {
    	  System.out.println("PasswordTextField not accepted data");
      }
      //To Click Login page
      
      WebElement LoginButton = driver.findElement(By.name("login"));
      LoginButton.click();
      System.out.println("HomePage is displayed");
      
      //To close the browser
      
      System.out.println("Browser got closed successfully");
      driver.quit();
      
      
      
      
      
      
      
      
      
	}

}
