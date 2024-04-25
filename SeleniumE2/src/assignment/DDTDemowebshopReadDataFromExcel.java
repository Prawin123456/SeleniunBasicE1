package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTDemowebshopReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		//step1
		FileInputStream fis=new FileInputStream("./testData/testDataE2.xlsx");
		
		//step2
		Workbook wb=WorkbookFactory.create(fis);
		
		//step3
		String URL=wb.getSheet("sheet2").getRow(0).getCell(0).toString();
		String EMAIL=wb.getSheet("sheet2").getRow(1).getCell(0).toString();
		String FIRSTNAME=wb.getSheet("sheet2").getRow(2).getCell(0).getStringCellValue();
		String LASTNAME=wb.getSheet("sheet2").getRow(3).getCell(0).toString();
		String PASSWORD=wb.getSheet("sheet2").getRow(4).getCell(0).toString();
		String CONFIRMPASSWORD=wb.getSheet("sheet2").getRow(5).getCell(0).getStringCellValue();
		
		
		//SCRIP
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(URL);
		driver.findElement(By.name("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.name("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.name("Email")).sendKeys(EMAIL);
		driver.findElement(By.name("Password")).sendKeys(PASSWORD);
		driver.findElement(By.name("ConfirmPassword")).sendKeys(CONFIRMPASSWORD);
		
		

	}

}
