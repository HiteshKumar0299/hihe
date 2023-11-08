package sin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Oct26_notification_popup {
	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver w1 = new ChromeDriver(opt);
		
		w1.manage().window().maximize();
		
		w1.get("https://www.yatra.com/");
		
		
	}

}
