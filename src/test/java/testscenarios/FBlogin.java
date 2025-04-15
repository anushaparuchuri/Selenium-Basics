package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {

	public static void main(String[] args) {

		//Login to FB application
//		0. Create an webdriver object
		WebDriver driver;
//		1. Open any browser
		driver = new ChromeDriver();
		
		//WebDriver driver = new ChromeDriver();
		
//		2. Type URL of FB application
		driver.get("https://www.facebook.com/");
		
//		3. Type invalid credentials
		//selenium will find the object by using any Webdriver Locators
		driver.findElement(By.name("email")).sendKeys("AnushaTest@gmail.sdgsom");
		driver.findElement(By.id("pass")).sendKeys("testsdgsdgdsg");
		
//		4. Click on login button
		driver.findElement(By.name("login")).click();
		
	}

}
