package in;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct19_facebook_by_dropdown_keysenum {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://www.facebook.com/");
		w1.findElement(By.cssSelector("[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(2000);
		w1.findElement(By.cssSelector("[name='firstname']")).sendKeys("hitesh",Keys.TAB,"Kumar",Keys.TAB,"6284278041",Keys.TAB,"shaunty",Keys.TAB,Keys.TAB,Keys.DOWN,Keys.TAB,Keys.DOWN,Keys.TAB,Keys.DOWN,Keys.TAB,Keys.TAB,Keys.ARROW_RIGHT,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		
		
		
	}

}
