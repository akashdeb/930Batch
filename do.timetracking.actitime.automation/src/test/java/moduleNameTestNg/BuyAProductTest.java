package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyAProductTest {
	
	@Test (groups = "smoke")
	public void loginTest() {
		System.out.println("Logged in successfully");
	}
	@Test (groups = "smoke")
	public void searchForProductTest() {
		System.out.println("Product found");
	}
	
	@Test (groups = "regression")
	public void addProductToCartTest() {
		System.out.println("Product Added successfully");
	}
	@Test (groups = "regression")
	public void paymentTest() {
		System.out.println("Payment was successfull");
	}
	@Test (groups = "smoke")
	public void logoutTest() {
		System.out.println("Logged out successfully");
	}


}
