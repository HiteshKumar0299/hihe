
package in;

// ---------6----------

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Oct18_clickandhold {
	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		// Click and Hold
		
		w1.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement a = w1.findElement(By.xpath("//li[text()='B']"));
		
		Actions act = new Actions(w1);
		act.clickAndHold(a).perform();
	}

}
