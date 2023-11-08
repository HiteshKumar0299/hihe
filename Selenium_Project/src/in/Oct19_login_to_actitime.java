package in;

// -----------3-------------


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct19_login_to_actitime {
	public static void main(String[] args) {
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://demo.actitime.com/login.do");
		
		w1.findElement(By.cssSelector("[name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);

}

}