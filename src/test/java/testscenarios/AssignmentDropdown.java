package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDropdown {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		// Dropdown 1

		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Select city = new Select(driver.findElement(By.name("fromPort")));
		city.selectByVisibleText("Boston");

		Select city2 = new Select(driver.findElement(By.name("toPort")));
		city2.selectByVisibleText("London");
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

		// Dropdown 2
		
		Thread.sleep(3000);
		
		driver.get("https://www.pqe.io/go-signup/");
		Select cntry = new Select(driver.findElement(By.name("nationality")));
		cntry.selectByVisibleText("INDIA");
		
		Select attendee = new Select(driver.findElement(By.name("attendeeType")));
		attendee.selectByVisibleText("Graduate");
		
		// Dropdown 3
		
		Thread.sleep(3000);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		year.selectByVisibleText("1947");
		
		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		month.selectByVisibleText("August");
		
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
		day.selectByVisibleText("15");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
