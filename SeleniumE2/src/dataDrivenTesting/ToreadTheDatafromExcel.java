package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToreadTheDatafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		//create an object of FIS
		FileInputStream fis=new FileInputStream("./testData/testDataE1.xlsx");
		
		//step 2
		Workbook wb=WorkbookFactory.create(fis);
		
		//step3
		String URL=wb.getSheet("sheet1").getRow(0).getCell(0).toString();
		String USERNAME=wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String PASSWORD=wb.getSheet("sheet1").getRow(2).getCell(0).toString();
		
		//script
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);

	}
}
