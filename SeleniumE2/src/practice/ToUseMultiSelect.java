package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        //To declare implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
     //   driver.findElement(By.name("user_name")).sendKeys("admin");
       // Thread.sleep(2000);
    //    driver.findElement(By.name("user_password")).sendKeys("password");
      //  Thread.sleep(2000);
        //driver.findElement(By.id("submitButton")).click();
        
        //To hamdle multiselect drolist
        
        WebElement multiselectlist = driver.findElement(By.linkText("Country"));
        
        Select multiSelects=new Select(multiselectlist);
        System.out.println(multiSelects.isMultiple());
       
        
        multiSelects.selectByValue("Canada");
        multiSelects.selectByValue("Germany");
        multiSelects.selectByValue("Poland");
        
        
        
        
	}

}
