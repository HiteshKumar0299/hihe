package sin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Oct27_automationpopup {
	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		 Fileupload Popup
		
		w1.get("https://the-internet.herokuapp.com/upload");
		
		w1.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Admin\\Documents\\Report receit.pdf");
	}
	
	  

}
