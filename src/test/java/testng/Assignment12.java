package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment12 {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://autotestdata.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[2]/div/button/div/div/div"))
				.click();
		driver.findElement(By.linkText("Credit Card")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[5]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"total-rows-gen\"]")).sendKeys("100");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/div")).click();
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/button")));
		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/button")).click();

	}
}
