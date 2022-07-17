package Sample;

import org.testng.annotations.Test;

public class OrganizationTest {

	@Test(groups = "RegressionTest")
	public void createOrganization() {
		System.out.println("=========organization ceated============");
		
		System.out.println("=========organization deleted===========");
		
		System.out.println("=======Adding new statment in organization test=======");
	}
	
	
	@Test(groups = "SmokeTest")
	public void editOrganization() {
		System.out.println("=========organization edited===========");
	}
}
