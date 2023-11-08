package basic_of_testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nov1_addtocart {
	
  @Test()
	
	public void addToCart()
	{
		WebDriver	w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		w1.get("https://www.flipkart.com/");

		w1.findElement(By.xpath("//span[text()='✕']")).click();

		w1.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		w1.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Starlight, 128 GB)']")).click();

		String window_id =	w1.getWindowHandle();
		Set<String> all_id =	w1.getWindowHandles();
		for (String id : all_id) {
			w1.switchTo().window(id);
			if 	(w1.getTitle().contains("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com")) {
				break;
			}
		}
		w1.findElement(By.xpath("//button[text()='Add to cart']")).click();
		w1.switchTo().window(window_id);
		w1.findElement(By.xpath("//span[text()='Cart']")).click();
		
		w1.quit();

	}

}
