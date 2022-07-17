package Sample;

import org.testng.annotations.Test;

public class ProductsTest {
	
	@Test(groups = "SmokeTest")
	public void createProductTest() {
		System.out.println("==========product created==========");
		
		System.out.println("==========product deleted==========");
	}
	
	@Test(groups = "RegressionTest")
	public void editProductTest() {
		System.out.println("==========edit product==========");
	}
}
