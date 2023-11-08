package in;

//----------------3-----------------

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct25_alert_popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Accept()
		
//		w1.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Alert alt =  w1.switchTo().alert();
//		
//		Thread.sleep(2000);
//		alt.accept();
		
		
		// Dismiss()
		
//		w1.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//		Alert alt = w1.switchTo().alert();
//		
//		Thread.sleep(2000);
//		alt.dismiss();
		
		
		// Sendkeys
		
//		w1.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		
//		Alert alt = w1.switchTo().alert();
//		
//		alt.sendKeys("hi");
//		Thread.sleep(2000);
//		alt.accept();
		
		
		// gettext()
		
//		w1.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Alert alt = w1.switchTo().alert();
//		
//		System.out.println(alt.getText());
	
	  
		
		
		
		
		
		
		
		
	}

}
