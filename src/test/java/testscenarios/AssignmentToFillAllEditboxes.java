package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentToFillAllEditboxes {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("ABCDEF");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("GHIJKL");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("12234-N56ST-NewJersey");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("ABCDEF@XYZ.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
	  
	    //scroll up	  
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
		 Thread.sleep(1000);
	    //combobox
	    driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
	    Thread.sleep(1000);
	    //Optional values
	    driver.findElement(By.linkText("English")).click();
	    driver.findElement(By.linkText("Hindi")).click();	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		
		

	}

}
