package basic_of_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nov1_login {
	
	public static WebDriver w1;
	
@Test()
	
	public void Login()
	{
	    w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        w1.get("https://demowebshop.tricentis.com/login");
		
		w1.findElement(By.id("Email")).sendKeys("hitesh200uupa@gmail.com" , Keys.TAB , "BKjRJT@bfw3*A",Keys.ENTER);
		
		
	}

}
