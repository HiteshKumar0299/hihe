package in;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Oct25_assign2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://demo.actitime.com/login.do");
		
		w1.findElement(By.name("username")).sendKeys("admin",Keys.ENTER.TAB,"manager",Keys.ENTER);
		
		w1.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		
		w1.findElement(By.xpath("//a[text()='Types of Work']")).click();
		
		w1.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		
		Thread.sleep(2000); 
		
		w1.findElement(By.id("name")).sendKeys("Punch1");
		Thread.sleep(2000); 
		
	   WebElement dropdown =w1.findElement(By.name("active"));
		
	   Thread.sleep(2000); 
		Select s1 = new Select(dropdown);
		s1.selectByIndex(1);
		
		Thread.sleep(2000); 
		w1.findElement(By.name("billable")).click();
		
		Thread.sleep(2000); 
		w1.findElement(By.cssSelector("[onclick='handleCancel();']")).click();
		
		Alert alt = w1.switchTo().alert();
		alt.accept();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) w1;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshot6/image.png");
		FileHandler.copy(src, dest);
		
			
			
		
		
	
		
		
	}

}
