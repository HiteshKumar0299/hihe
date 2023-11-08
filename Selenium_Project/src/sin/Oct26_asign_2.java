package sin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct26_asign_2 {
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		Frames  
		
		w1.get("file:///C:/Users/Admin/AppData/Local/Microsoft/Windows/INetCache/IE/K0H1Q602/iframe[1].html");
//		
//		
//		w1.switchTo().frame(0);
//		
//		w1.findElement(By.linkText("Log in")).click();
		
//		w1.switchTo().frame(1);
//		
//		w1.findElement(By.cssSelector("[class='bars']")).click();
		
		
		
		// by id
		
//		w1.switchTo().frame("FR1");
//		
//		w1.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		
		
		
		// by name
		
		
//		w1.switchTo().frame("frame1");
//		
//		w1.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		
		
		// by attribute
		
		
	   WebElement web =	w1.findElement(By.cssSelector("[src='https://demowebshop.tricentis.com']"));
	   
	   w1.switchTo().frame(web);
		
		w1.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		
		w1.switchTo().defaultContent();
		
//		w1.switchTo().parentFrame();
		w1.findElement(By.linkText("Google")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
