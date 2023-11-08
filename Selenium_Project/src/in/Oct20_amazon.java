package in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oct20_amazon {
	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		w1.get("https://www.flipkart.com/");
		
		w1.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		w1.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		
		w1.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		
		
		
		
		
	}

}
