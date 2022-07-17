package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest_DataProviderTest {

	@Test(dataProvider = "dataProvider_BookTicketTest")
	public void bookTicket(String src,String dest,int ticket) {
		System.out.println("Booking ticket from "+src+" to "+dest+" ticket rate "+ticket);
	}
	@DataProvider 
	public Object[][] dataProvider_BookTicketTest() {
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="Banglore";
		objArr[0][1]="Mysore";
		objArr[0][2]=500;
		
		objArr[1][0]="Banglore";
		objArr[1][1]="Davanagere";
		objArr[1][2]=1500;
		
		objArr[2][0]="Banglore";
		objArr[2][1]="Mumbai";
		objArr[2][2]=2500;
		return objArr;
	}
}
