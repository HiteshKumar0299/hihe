package sin1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct30_fetch_data_from_propertiesfile {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\key value.properties"); // give the path of test data
		
		Properties pj = new Properties();  // fetch the test data 
		
		pj.load(fis);                     // load the test data
		
	    String s1 =	pj.getProperty("url");
	    //w1.get(s1); 
	    
	    String s2 = pj.getProperty("un"); 
	   // w1.get(s2);
	    
	    String s3 = pj.getProperty("pwd");
	   // w1.get(s3);
	    
	    
	    WebDriver w1 = new ChromeDriver();
	    w1.manage().window().maximize();
	    
	    w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    w1.get(s1);
	    
	    w1.findElement(By.name("username")).sendKeys(s2,Keys.TAB,s3,Keys.ENTER);
	    
	    
	    
//	    WorkbookFactory.create(false);
	    
	    
		
		
		
		
	}

}
