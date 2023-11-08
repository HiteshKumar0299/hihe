package sin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Oct26_assign_1 {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		w1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		w1.findElement(By.name("username")).sendKeys("Admin",Keys.ENTER.TAB,"admin123",Keys.ENTER);
		
		w1.findElement(By.xpath("//span[text()='Admin']")).click();
		
		w1.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		
		WebElement web =w1.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[1]"));
		web.click();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		w1.findElement(By.cssSelector("[placeholder='Type for hints...']")).sendKeys("cristiano jr",Keys.TAB,Keys.DOWN,Keys.TAB,"hitesh",Keys.TAB,"hitesh@123",Keys.TAB,"hitesh@123");
		
//		TakesScreenshot ts = (TakesScreenshot)w1;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File("./Screenshot6/image2.png");
//		FileHandler.copy(src, dest);
//	
		w1.findElement(By.cssSelector("[class='oxd-userdropdown-tab']")).click();

		
		w1.findElement(By.xpath("//a[text()='Logout']")).click();
	 
	
		
		
	}

}
