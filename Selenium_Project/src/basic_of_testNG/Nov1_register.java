package basic_of_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nov1_register {
	
   @Test()
	
	public void Register()
	{
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://demowebshop.tricentis.com/register");
		
		w1.findElement(By.cssSelector("[name='FirstName']")).sendKeys("Hitesh",Keys.TAB,"Kumar",Keys.TAB,"hitesh200uupa@gmail.com",Keys.TAB,"BKjRJT@bfw3*A",Keys.TAB,"BKjRJT@bfw3*A",Keys.TAB);
		
		w1.findElement(By.cssSelector("[id='register-button']")).click();
		
		w1.quit();
		
	}

}
