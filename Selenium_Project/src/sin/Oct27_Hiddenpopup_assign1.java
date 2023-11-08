package sin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oct27_Hiddenpopup_assign1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://demo.actitime.com/login.do");
		
		w1.findElement(By.id("username")).sendKeys("admin",Keys.ENTER.TAB,"manager",Keys.ENTER);
		
		w1.findElement(By.cssSelector("[id='container_tasks']")).click();
		
		w1.findElement(By.xpath("(//div[@class='img'])[1]")).click();
		
		w1.findElement(By.cssSelector("[class='delete button']")).click();
		
		WebDriverWait wait = new WebDriverWait(w1,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(w1.findElement(By.xpath("//div[contains(text(),'You are about to delete 68 tasks')]"))));
		
		String s1 =  w1.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		System.out.println(s1);
		
		
	}

}
