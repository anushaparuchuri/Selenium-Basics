package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Fblogin {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("AnushaTest@gmail.sdgsom");
		driver.findElement(By.id("pass")).sendKeys("testsdgsdgdsg");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		// Close the current browser/window
		//driver.close();
		driver.quit();
	}

}
