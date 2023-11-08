package sin1;

// -----------------------------2-------------------------------

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oct30_handling_disable_Elements {

	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://demoapp.skillrary.com/");
		
		 WebElement web = w1.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor jse = (JavascriptExecutor) w1;
		jse.executeScript("arguments[0].value='miller'",web);
		
		
		
		
		
		
	}
}
