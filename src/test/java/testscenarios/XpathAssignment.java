package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAssignment {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");		
		driver.manage().window().maximize();
		Select cntry = new Select(driver.findElement(By.xpath("//*[@name='fromPort']")));
		cntry.selectByVisibleText("Mexico City");		
		Thread.sleep(3000);		
		Select cntry2 = new Select(driver.findElement(By.xpath("//*[@name='toPort']")));		
		cntry2.selectByVisibleText("London");		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();	
		

	}

}
