package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkDemo {

	public static void main(String[] args) {
		
		WebDriver driver;		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");		
		driver.findElement(By.linkText("Forgot password?")).click();

		
			
	}

}
