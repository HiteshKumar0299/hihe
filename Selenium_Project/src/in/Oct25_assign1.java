package in;

//--------------2--------------


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct25_assign1 {
	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://www.flipkart.com/");
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		w1.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		
		w1.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Starlight, 128 GB)']")).click();
		
		w1.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']")).click();
		
		
		String window_id = w1.getWindowHandle();
		
		Set<String> all_id = w1.getWindowHandles();
		
		for (String id : all_id) {
			
			w1.switchTo().window(id);
			
			if (w1.getTitle().contains("APPLE iPhone 14")) {
				
				w1.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			}
			
			else if(w1.getTitle().contains("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com"))
			{
				w1.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			}
			
			else if(w1.getTitle().contains("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com"))
			{
				w1.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();		
			}
			
		}
        

		
		
		
	}

}
