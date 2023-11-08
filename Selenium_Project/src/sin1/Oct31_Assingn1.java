package sin1;


//     --------------------1--------------------

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oct31_Assingn1 {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Fetching data from properties 
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Admin\\Documents\\key   value123.properties");
		Properties p = new Properties();
		p.load(fs);
		
		String s1 = p.getProperty("url");
		w1.get(s1);
		
		w1.findElement(By.cssSelector("[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		String fn = p.getProperty("fname");
		String ln = p.getProperty("lname");
		String mb = p.getProperty("mobile");
		String pd = p.getProperty("pwd");
		String dt = p.getProperty("date");
		String mn = p.getProperty("month");
		String yr = p.getProperty("year");
		
		
		w1.findElement(By.cssSelector("[name='firstname']")).sendKeys(fn,Keys.TAB,ln,Keys.TAB,mb,Keys.TAB,pd);
		
		WebElement dropdown = w1.findElement(By.id("day"));
		Select sl = new Select(dropdown);
		sl.selectByVisibleText(dt);
		
		WebElement dropdown1 = w1.findElement(By.id("month"));
		Select sl1 = new Select(dropdown1);
		sl1.selectByVisibleText(mn);
		
		WebElement dropdown2 = w1.findElement(By.id("year"));
		Select sl2 = new Select(dropdown2);
		sl2.selectByVisibleText(yr);
		
		w1.findElement(By.xpath("(//label[contains(@class,'8mt')])[2]")).click();
		
//		w1.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
