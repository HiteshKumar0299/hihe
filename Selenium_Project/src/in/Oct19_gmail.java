package in;

// -------1-----

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Oct19_gmail {
	
	public static void main(String[] args) throws InterruptedException {
		
		// inspecting the gmail
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.get("https://www.google.com/");
		
	WebElement web = w1.findElement(By.xpath("(//a[@class='gb_E'])[1]"));
		
		Thread.sleep(2000);
		Actions act = new Actions(w1);
		act.contextClick(web).perform();
		
		
		
		
		
	}

}
