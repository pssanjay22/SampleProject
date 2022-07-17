package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
 
public class AssertionTest {

	@Test
	public void createCustomerTest() {
		System.out.println("<------------step1---------->");
		System.out.println("<------------step2---------->");
		Assert.assertEquals("A","B");
		//Assert.fail();
		System.out.println("<------------step3---------->");
		System.out.println("<------------step4---------->");
	}
	
	@Test
	public void createProductsTest() {
		System.out.println("<------------step5---------->");
		System.out.println("<------------step6---------->");
		
		SoftAssert s=new SoftAssert();
		s.assertEquals("P", "S");
		System.out.println("<------------step7---------->");
		System.out.println("<------------step8---------->");
		s.assertAll();
	}
}
