package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFileTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/Exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet("Tabel").getRow(2).getCell(1).getStringCellValue();
		System.out.println(data);
	}

}
