package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelFileTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/Exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("Tabel").getRow(5).getCell(5).setCellValue("Hassan");
		FileOutputStream fos=new FileOutputStream("./testdata/Exceldata.xlsx");
		wb.write(fos);
		wb.close();
	}

}
