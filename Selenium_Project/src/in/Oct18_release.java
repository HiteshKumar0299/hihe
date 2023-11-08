package in;

// --------- 7-------

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Oct18_release {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement a = w1.findElement(By.xpath("//li[text()='A']"));
		WebElement b = w1.findElement(By.xpath("//li[text()='B']"));
		
		Actions act = new Actions(w1);
		
		act.clickAndHold(a).perform();
		Thread.sleep(2000);
		act.moveToElement(b).perform();
		Thread.sleep(2000);
		act.release().perform();
		
		


}
}
 