package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsDemo3 {
	@Test
	public void f() {
		System.out.println("@Test f");
	}
	
	@Test
	public void k() {
		System.out.println("@Test k");
	}
	@Test
	public void a() {
		System.out.println("@Test a");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

}
