package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsDemo1 {
	@Test(enabled = false)
	public void tc_01_loginToGmail() {
		System.out.println("tc_01_loginToGmail ");
	}

	@Test
	public void tc_02_composeAnEmail() {
		System.out.println("tc_02_composeAnEmail ");
	}

	@Test(enabled = false)
	public void tc_03_checkSentItems() {
		System.out.println("tc_03_checkSentItems");
	}

	@Test
	public void tc_04_logoutonGmail() {
		System.out.println("tc_04_logoutonGmail");
	}
}
