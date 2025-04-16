package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandleDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.pqe.io/go-signup/");
		Thread.sleep(6000);
	
		
		Select cntry = new Select(driver.findElement(By.name("nationality")));
		cntry.selectByVisibleText("ANGOLA");
		Thread.sleep(3000);
		
		
		driver.get("https://blazedemo.com/");
		Select abc = new Select(driver.findElement(By.name("fromPort")));
		abc.selectByVisibleText("Mexico City");
		
		
	}

}
