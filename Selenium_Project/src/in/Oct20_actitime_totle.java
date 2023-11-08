package in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oct20_actitime_totle {
	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		w1.get("https://demo.actitime.com/login.do");
		
		 String s1 = w1.getTitle();
		 System.out.println(s1);
		 
		 w1.findElement(By.cssSelector("[id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		 
		
		WebDriverWait wait = new WebDriverWait(w1, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(w1.findElement(By.id("container_tasks"))));
		
		String s2 = w1.getTitle();
		System.out.println(s2);
		
		
		
		
		
	}

}
