package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLogin1 {

	public static void main(String[] args) throws Exception {
		// 1. Create a webdriver object
		WebDriver driver;

		// 2. Open any browser
		driver = new ChromeDriver();
		
		// 3. Type URL of the Login Application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		// 4. Type the given credentials
		// Username : Admin
		// Password : admin123
		
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	// 5. Click on Login button
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}

}
