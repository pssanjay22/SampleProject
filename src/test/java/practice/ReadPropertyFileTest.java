package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFileTest {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un = p.getProperty("un");
		String pwd = p.getProperty("pwd");
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
