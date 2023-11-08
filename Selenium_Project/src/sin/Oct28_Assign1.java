package sin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct28_Assign1 {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://www.naukri.com/");
		
		w1.findElement(By.xpath("//a[text()='Register']")).click();
		
		w1.findElement(By.id("name")).sendKeys("Hitesh",Keys.TAB,"hitesh2002uppal@gmail.com",Keys.TAB,"hitesh",Keys.TAB,"6284278041");
		
		w1.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();
		
		w1.findElement(By.xpath("//span[text()='Chennai']")).click();
		
		w1.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		
		StringSelection path = new StringSelection("C:\\Users\\Admin\\Documents\\Business Com\\Hitesh Kumar Resume.pdf");
		
		Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard();
		    cp.setContents(path, null); 
		    
		    Robot r = new Robot();
		    
		    r.keyPress(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_V);
		    r.keyRelease(KeyEvent.VK_CONTROL);
		    r.keyRelease(KeyEvent.VK_V);
		    
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		    
		    w1.findElement(By.xpath("//button[text()='Register now']")).click();
		
		
		
	}

}
