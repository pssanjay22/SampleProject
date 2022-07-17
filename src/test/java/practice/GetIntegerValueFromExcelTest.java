package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetIntegerValueFromExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/Exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		double value = wb.getSheet("Tabel").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(value);
	}

}
