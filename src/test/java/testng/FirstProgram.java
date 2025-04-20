package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstProgram {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		driver = new ChromeDriver();
		
		// Hyperlink 2
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("About Us")));
		jse.executeScript("arguments[0].click();", driver.findElement(By.linkText("About Us")));
		// driver.findElement(By.linkText("About Us")).click();
		
		//Hyperlink 3
		driver.get("https://autotestdata.com/");
		driver.findElement(By.linkText("Need Help?")).click();
		
		// Hyperlink 1
				driver.get("https://www.pqe.io/go-signup/");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.findElement(By.linkText("terms & conditions")).click();	

  }
}
