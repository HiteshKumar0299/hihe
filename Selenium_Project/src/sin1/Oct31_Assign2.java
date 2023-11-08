package sin1;

// -------------------------3----------------------------------

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.math3.fraction.ProperBigFractionFormat;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct31_Assign2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Admin\\Documents\\Book2.xlsx");
		
		Workbook book = WorkbookFactory.create(fs);
		Sheet sheet = book.getSheet("sheet1");
		
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		
		String un = cell.getStringCellValue();
		System.out.println(un);
		
		String cell1 = row.getCell(1).getStringCellValue();
		String cell2 = row.getCell(2).getStringCellValue();
		String cell3 = row.getCell(3).getStringCellValue();
		String cell4 = row.getCell(4).getStringCellValue();
		String cell5 = row.getCell(5).getStringCellValue();
		String cell6 = row.getCell(6).getStringCellValue();
		
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://www.facebook.com/");
		
		w1.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		w1.findElement(By.name("firstname")).sendKeys(un,Keys.TAB,cell1,Keys.TAB,cell2,Keys.TAB,cell3,Keys.TAB,Keys.TAB,cell4,Keys.TAB,cell5,Keys.TAB,cell6,Keys.TAB);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
