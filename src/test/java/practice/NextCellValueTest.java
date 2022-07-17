package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NextCellValueTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/Excelfile.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s= wb.getSheet("Sheet1");
		int count=s.getLastRowNum();
		String value = "telagana";
		for(int i = 0;i<=count;i++)
		{
			Row row = s.getRow(i);
			String firstvalue = row.getCell(0).getStringCellValue();
			if(firstvalue.equals(value))
			{
				String secondvalue = row.getCell(1).getStringCellValue();
				System.out.println(secondvalue);
			}
		}
		wb.close();
	}

}
