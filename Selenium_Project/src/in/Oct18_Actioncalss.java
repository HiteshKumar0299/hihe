package in;

//--------2------------

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Oct18_Actioncalss {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		w1.findElement(By.xpath("//span[contains(@class,'XB9F')]")).click();
		
	   WebElement fashion = w1.findElement(By.xpath("//span[text()='Fashion']"));
	
	   Actions act = new Actions(w1);
	   
	   act.moveToElement(fashion).perform();
	   
	   Thread.sleep(1000);
	   w1.findElement(By.linkText("Men's T-Shirts")).click();
		
	}

}
