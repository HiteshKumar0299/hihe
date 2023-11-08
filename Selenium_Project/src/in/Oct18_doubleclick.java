package in;

// ---------5------

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Oct18_doubleclick {
	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		// doubleClick
		
		w1.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement button = w1.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act = new Actions(w1);
		act.doubleClick(button).perform();
		
		
		
		
		
		
		
		
		
		
		
	}
}
