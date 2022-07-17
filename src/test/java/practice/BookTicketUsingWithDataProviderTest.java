package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTicketUsingWithDataProviderTest {

	@Test(dataProvider = "dataProvider_bookTicketTest")
	public void bookTicket(String src,String dest) {
		System.out.println("Book ticket from "+src+" to "+dest);
	}
	@DataProvider
	public Object[][] dataProvider_bookTicketTest() {
		Object[][] objArr=new Object[5][2];
		objArr[0][0]="Banglore";
		objArr[0][1]="Goa";
		
		objArr[1][0]="Banglore";
		objArr[1][1]="Mysore";
				
		objArr[2][0]="Banglore";
		objArr[2][1]="Manglore";
		
		objArr[3][0]="Banglore";
		objArr[3][1]="Davanagere";
		
		objArr[4][0]="Banglore";
		objArr[4][1]="Pune";
		return objArr;
	}
	
}
