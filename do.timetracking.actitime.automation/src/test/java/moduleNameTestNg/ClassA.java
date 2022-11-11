package moduleNameTestNg;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test (groups = "smoke")
	public void demo1() {
		System.out.println("From Demo 1");
		
	}
	@Test (groups = "regression")
	public void demo2() {
		System.out.println("From Demo 2");
		
	}
	@Test(groups = "smoke")
	public void demo3() {
		System.out.println("From Demo 3");
		
	}

}
