package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTestingDemo {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Please type valid browser name Firefox/Chrome/Edge****");
		}
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void f() throws Exception {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("AnushaTest@gmail.sdgsom");
		driver.findElement(By.id("pass")).sendKeys("testsdgsdgdsg");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

}
