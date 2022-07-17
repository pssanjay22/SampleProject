package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ContactTest {
	WebDriver driver=new ChromeDriver();
	
	@Test(groups="SmokeTest")
	public void editContactTest(String name) {
		String browser = System.getProperty("BROWSER");
		String url = System.getProperty("url");

			System.out.println(browser);
			System.out.println(url);
		System.out.println("=======contact edited=======");
		//Assert.fail();
		System.out.println("=======contact modified=======");
		
		System.out.println("=======contact deleted=======");
		
		
		System.out.println("=======Adding new statment in contact test=======");
		
	}
	/*@Test(groups="RegressionTest")
	public void createContactTest() {
		
		System.out.println("=======contact created========");
		
		
	}*/
	

}
