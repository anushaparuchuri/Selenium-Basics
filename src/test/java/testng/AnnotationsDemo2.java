package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsDemo2 {

	// Post-Condtion
	@AfterClass
	public void afterClass() {
		System.out.println("@BeforeClass");
	}

	// Pre-Condtion
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@Test
	public void f() {
		System.out.println("@Test f");
	}

}
