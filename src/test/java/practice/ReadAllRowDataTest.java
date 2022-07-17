package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllRowDataTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/Excelfile.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		int count = s.getLastRowNum();
		for(int i=1;i<=count;i++)
		{
			Row row = s.getRow(i);
			String firstrow = row.getCell(0).getStringCellValue();
			String secondrow = row.getCell(1).getStringCellValue();
			System.out.println(firstrow+"\t"+secondrow);
		}	
	}

}
