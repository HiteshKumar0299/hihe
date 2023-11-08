package in;

// -------------2----------

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct19_useof_keys_enum {
	
	public static void main(String[] args) {
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://www.flipkart.com/");
		
		w1.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	}

}
