package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void demo() {
		
		String expectedResult = "abc";
		String actualResult = "abc";
		
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Pass");
		
	}

}
