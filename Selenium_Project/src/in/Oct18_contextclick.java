package in;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//--------4-------

public class Oct18_contextclick {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://www.amazon.in/");
		
//		Threads.sleep(2000);
		Actions act = new Actions(w1);
		act.contextClick().perform();
		
		Robot r = new Robot();
		for(int i=0;i<10;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
