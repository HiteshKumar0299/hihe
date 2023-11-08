package in;

//-------3--------

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Oct18_Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
	WebElement web =w1.findElement(By.className("icp-nav-link-inner"));
	
	  Actions act = new Actions(w1);
	  act.moveToElement(web).perform();
	  
	  Thread.sleep(2000);
	  w1.findElement(By.xpath("//span[contains(text(),'हिन्दी')]")).click();
	
	}

}
