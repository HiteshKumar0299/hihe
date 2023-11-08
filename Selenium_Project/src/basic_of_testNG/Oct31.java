package basic_of_testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Oct31 {
	
	@Test(invocationCount = 2, priority = 1)
	
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
	

	@Test(priority = 2)
	
	public void Login()
	{
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        w1.get("https://demowebshop.tricentis.com/login");
		
		w1.findElement(By.id("Email")).sendKeys("hitesh200uupa@gmail.com" , Keys.TAB , "BKjRJT@bfw3*A",Keys.ENTER);
		
		w1.quit();
		
	}
	
	@Test(priority = 3)
	
	public void addToCart()
	{
		WebDriver	w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		w1.get("https://www.flipkart.com/");

		w1.findElement(By.xpath("//span[text()='✕']")).click();

		w1.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		w1.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Starlight, 128 GB)']")).click();

		String window_id =	w1.getWindowHandle();
		Set<String> all_id =	w1.getWindowHandles();
		for (String id : all_id) {
			w1.switchTo().window(id);
			if 	(w1.getTitle().contains("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com")) {
				break;
			}
		}
		w1.findElement(By.xpath("//button[text()='Add to cart']")).click();
		w1.switchTo().window(window_id);
		w1.findElement(By.xpath("//span[text()='Cart']")).click();
		
		w1.quit();

	}
	
	@Test(enabled = false)
	
		public void Logout()
		{
		WebDriver	w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
        w1.get("https://demowebshop.tricentis.com/login");
		
		w1.findElement(By.id("Email")).sendKeys("hitesh200uupa@gmail.com" , Keys.TAB , "BKjRJT@bfw3*A",Keys.ENTER);
		
		w1.findElement(By.linkText("Log out")).click();
		
		w1.quit();
		
		
		}
	
	
	
	
	

}
