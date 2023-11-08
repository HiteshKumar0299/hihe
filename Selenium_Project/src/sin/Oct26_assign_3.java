package sin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class Oct26_assign_3 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver w1 = new ChromeDriver(opt);
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		w1.switchTo().frame(0);
		
		w1.findElement(By.linkText("Free Mock Tests")).click();
		
//		String s1 = w1.getWindowHandle();
		Set<String> s2 = w1.getWindowHandles();
		
		for(String s3 : s2)
		{
			w1.switchTo().window(s3);
			if(w1.getCurrentUrl().contains("https://www.mocktest.freshersnow.com/home"))
			{
				break;
			}
		}
		
		Actions act = new Actions(w1);
		act.moveToElement(w1.findElement(By.id("all-exams-id"))).perform();
		
		w1.findElement(By.xpath("(//a[text()='SSC'])[1]")).click();
		
		w1.findElement(By.xpath("(//a[text()='SSC CHSL'])[1]")).click();
		
	
		WebElement logo = w1.findElement(By.xpath("//li[@class='active']/h1"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot6/image3.png");
		FileHandler.copy(src, dest);
		
	
		
		
		
		
		
		
	}

}
