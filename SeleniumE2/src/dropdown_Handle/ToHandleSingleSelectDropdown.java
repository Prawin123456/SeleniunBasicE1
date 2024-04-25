package dropdown_Handle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		// To locate dropdown

		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));

		// to handle dropdown

		Select daySelect = new Select(daydropdown);
		Select monthSelect = new Select(monthdropdown);
		Select yearSelect = new Select(yeardropdown);

		// call method

		daySelect.selectByIndex(1);
		monthSelect.selectByValue("4");
		yearSelect.selectByVisibleText("2022");

		// To check whether it is a select or multiselect
		System.out.println(daySelect.isMultiple());// false

		// To fEtch all element of months
		List<WebElement> allmonths = monthSelect.getOptions();
		for (WebElement month : allmonths) {
			System.out.println(month.getText());
			monthSelect.deselectByVisibleText(month.getText());
			Thread.sleep(2000);

		}

	}

}
