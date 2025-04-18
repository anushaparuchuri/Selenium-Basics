package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_HyperLink {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		// Hyperlink 1
		driver.get("https://www.pqe.io/go-signup/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("terms & conditions")).click();	

		// Hyperlink 2
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.linkText("About Us")).click();
		
		//Hyperlink 3
		driver.get("https://autotestdata.com/");
		driver.findElement(By.linkText("Need Help?")).click();
		
	}

}
