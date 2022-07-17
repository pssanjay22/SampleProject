package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVtigerTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/Logindetalis.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String url = wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String un = wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		String pwd = wb.getSheet("Login").getRow(1).getCell(2).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		driver.close();
		
	}

}
