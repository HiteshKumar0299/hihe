package sin1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//  ---------------------2---------------------

public class Oct31_fetch_datafrom_excel_file {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		WebDriver w1 = new ChromeDriver();
//		w1.manage().window().maximize();
//		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Admin\\Documents\\Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(fs);
		
		Sheet sheet = book.getSheet("sheet1");
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		String un = cell.getStringCellValue();
		System.out.println(un);
		
		Cell pass = row.getCell(1);
		
		String  password = pass.getStringCellValue();
		System.out.println(password);
		
		
		
		
		
//		
		
	}
	
	

}
