package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.proearn.genericutility.ExcelUtility;

public class FetchDataFromExcelTo_DpTest {

	@Test(dataProvider = "dataProvider_BookTicketTest")
	public void bookTicket(String src,String dest) {
		System.out.println("Booking ticket from "+src+" to "+dest);
	}
	@DataProvider
	public Object[][] dataProvider_BookTicketTest() throws Throwable {
		Object[][] objArr=new Object[5][2];
		ExcelUtility eLib=new ExcelUtility();
		objArr[0][0]=eLib.getDataFromExcel("Places", 1, 0);
		objArr[0][1]=eLib.getDataFromExcel("Places", 1, 1);
		
		objArr[1][0]=eLib.getDataFromExcel("Places", 2, 0);
		objArr[1][1]=eLib.getDataFromExcel("Places", 2, 1);
		
		objArr[2][0]=eLib.getDataFromExcel("Places", 3, 0);
		objArr[2][1]=eLib.getDataFromExcel("Places", 3, 1);
		
		objArr[3][0]=eLib.getDataFromExcel("Places", 4, 0);
		objArr[3][1]=eLib.getDataFromExcel("Places", 4, 1);
		
		objArr[4][0]=eLib.getDataFromExcel("Places", 5, 0);
		objArr[4][1]=eLib.getDataFromExcel("Places", 5, 1);
		
		return objArr;
	}
}
