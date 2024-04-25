package demoAppsQspider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        
        WebElement button = driver.findElement(By.xpath("//li[@class='fno-use relative hover:bg-orange-50']"));
        
        Actions action = new Actions(driver);
        action.click(button);
	}

}
