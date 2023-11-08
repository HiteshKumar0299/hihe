package basic_of_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nov1_logout extends Nov1_login{
	
	@Test()
	
	public void Logout()
	{
	
	w1.findElement(By.linkText("Log out")).click();
	
	w1.quit();
	
	
	}


}
