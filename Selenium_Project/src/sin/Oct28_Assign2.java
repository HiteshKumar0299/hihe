package sin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct28_Assign2 {
	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://www.irctc.co.in/nget/train-search");
		
        w1.findElement(By.id("jDate")).click();
		
		while(true) {
			
		String month = w1.findElement(By.className("ui-datepicker-month")).getText();
		
		String year = w1.findElement(By.className("ui-datepicker-year")).getText();
		
		if(month.equals("November") && year.equals("2023")) {
			
			w1.findElement(By.xpath("//a[text()='22']")).click();
			break;
			
		}
		 
		else {
			
			w1.findElement(By.className("ui-datepicker-next-icon")).click();
		}
			
		}
		
		
			
			
			
			
		
	}
	

}
