package FileReadingandWriting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExcelReading {

	static	List<String>username=new ArrayList<String>();
	static List<String>password=new ArrayList<String>();
	
	
	public static void ExcelRead() throws IOException {
		FileInputStream file=new FileInputStream("E://Book1.xlsx/");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet  sheet=workbook.getSheet("Sheet2");
		
	
		
		Iterator<Row> it=sheet.iterator();
		while(it.hasNext()) {
			Row row=it.next();
			Iterator<Cell> cellvalue=row.iterator();
			int i=2;
			while(cellvalue.hasNext()) {
				if(i%2==0) {
					
					username.add(cellvalue.next().getStringCellValue());
				}else {
					password.add(cellvalue.next().getStringCellValue());
				}
				i++;
				
				
			}
		}
	}
	
	
	public static void start(String Uname, String Pwrd) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver .get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pwrd);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
		
	}
	
	
	public static void execute() {
		for(int i=0;i<username.size();i++) {
			start(username.get(i),password.get(i));
		}
	}
	public static void main(String []args) throws IOException {
		ExcelReading.ExcelRead();
		ExcelReading.execute();
		
	}
}
