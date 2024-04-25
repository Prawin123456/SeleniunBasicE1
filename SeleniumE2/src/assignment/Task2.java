package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
       
        driver.navigate().to("https://www.youtube.com/");
       
        String urlOfWebpage = driver.getCurrentUrl();
        System.out.println(urlOfWebpage);
        driver.close();
        driver.quit();

	}

}
