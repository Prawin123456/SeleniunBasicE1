package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTdemowebshopRegisterReadDataFromProperties {

	public static void main(String[] args) throws IOException {

		// step one create an object
		FileInputStream fis = new FileInputStream("./testData/demoData.properties");

		// create an object respective file type
		Properties prop = new Properties();

		// call the methods

		prop.load(fis);
		String URL = prop.getProperty("url");
		String FIRSTNAME = prop.getProperty("FirstName");
		String LASTNAME = prop.getProperty("LastName");
		String EMAIL = prop.getProperty("Email");
		String PASSWORD = prop.getProperty("Password");
		String CONFIRMPASSWORD = prop.getProperty("ConfirmPassword");

		// script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(URL);
		driver.findElement(By.name("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.name("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.name("Email")).sendKeys(EMAIL);
		driver.findElement(By.name("Password")).sendKeys(PASSWORD);
		driver.findElement(By.name("ConfirmPassword")).sendKeys(CONFIRMPASSWORD);
		driver.quit();
		

	}

}