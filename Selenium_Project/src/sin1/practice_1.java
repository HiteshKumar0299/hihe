package sin1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_1 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Admin\\Documents\\key value1.properties");
		
		Properties p = new Properties();
		
		p.load(fs);
		
		String url =p.getProperty("url");
		String nm =p.getProperty("fname");
		String ln =p.getProperty("lname");
		String email =p.getProperty("email");
		String pwd =p.getProperty("pwd");
		String cpwd =p.getProperty("cpwd");
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://demowebshop.tricentis.com/register");
		
		w1.findElement(By.xpath("(//input[@class='text-box single-line'])[1]")).sendKeys(nm,Keys.TAB,ln,Keys.TAB,email,Keys.TAB,pwd,Keys.TAB,cpwd,Keys.ENTER);
	
		
		
		
	}

}