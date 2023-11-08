package sin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct28_calendar_popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriver w1  = new ChromeDriver();
		 w1.manage().window().maximize();
		 
		 w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 w1.get("https://jqueryui.com/datepicker/");
		 
		 w1.switchTo().frame(0);
		 
		 
//		 w1.findElement(By.xpath("//input[@type='text']")).click(); 
//		 w1.findElement(By.cssSelector("[data-date='29']")).click();
		 
		 w1.findElement(By.id("datepicker")).click();
		 
			while(true)
			{
				String month = w1.findElement(By.className("ui-datepicker-month")).getText();
				String year = w1.findElement(By.className("ui-datepicker-year")).getText();
				if(month.equals("May")&&year.equals("2002"))
				{
					w1.findElement(By.xpath("//a[text()='15']")).click();
					break;
					}
				else
				{
					w1.findElement(By.xpath("//span[text()='Prev']")).click();
				}
			}

		 
		 
		 
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
