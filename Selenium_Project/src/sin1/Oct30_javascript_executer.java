package sin1;

// ---------------------1-------------------------


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct30_javascript_executer {
	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// executeScript()
		
		
//		w1.get("https://demoapp.skillrary.com/");
//		
//		JavascriptExecutor ex = (JavascriptExecutor) w1;
//		ex.executeScript("window.scrollBy(0,1000)");
		
		
		
//		w1.get("https://www.zomato.com/india");
//		
//		w1.findElement(By.xpath("//h5[text()='Malaysia']")).click();
//		
//		JavascriptExecutor ex1 = (JavascriptExecutor) w1;
//		ex1.executeScript("window.scroll(0,1200)");
//		
		
		
//		w1.get("https://paytm.com/");
//		
//		w1.findElement(By.cssSelector("[src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
		
		
		
//		No need to find x-axis and y-axis
		
		
		w1.get("https://www.zomato.com/india");
		
		WebElement web =w1.findElement(By.xpath("//h5[text()='United Kingdom']"));
		JavascriptExecutor ex2 = (JavascriptExecutor) w1;
		
		ex2.executeScript("arguments[0].scrollIntoView(true)",web);
		
//		ex2.executeScript("arguments[0].scrollIntoView(false)",web);
		
		
		
		// we use arguments[0] when we have only one web element to find.   
		
		
		
		
		
		
	}

}
