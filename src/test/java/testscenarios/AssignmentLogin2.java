package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLogin2 {

	public static void main(String[] args) {
		// 1. Create a webdriver object
		WebDriver driver;
		
		// 2. Open any browser
		driver = new ChromeDriver();
		
		// 3. Type URL of the application
		driver.get("https://automationexercise.com/login");
		
		//4. Type the invalid credentials
		driver.findElement(By.name("email")).sendKeys("anusha123@gmail.1234");
		driver.findElement(By.name("password")).sendKeys("Anushaabcd$");
		
		// 5. Click Login button
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		
		
		

	}

}
