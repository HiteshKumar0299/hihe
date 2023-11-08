package mypractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class practice1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		 
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		
		w1.get("https://www.amazon.in/");
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.findElement(By.cssSelector("[type='text']")).sendKeys("mobile",Keys.ENTER);
		
		w1.findElement(By.xpath("//span[text()='Redmi A2 (Sea Green, 2GB RAM, 64GB Storage)']")).click();
		
		w1.findElement(By.xpath("//span[text()='Redmi 12 5G Jade Black 4GB RAM 128GB ROM']")).click();
		
		String window_id = w1.getWindowHandle();
		Set<String> all_id = w1.getWindowHandles();
		
		for(String id : all_id)
		{
			w1.switchTo().window(id);
			if(w1.getTitle().contains("Redmi A2 (Sea Green, 2GB RAM, 64GB Storage) : Amazon.in: Electronics"))
			{
				w1.findElement(By.cssSelector("[name='submit.add-to-cart']")).click();
			}
			else if(w1.getTitle().contains("Redmi 12 5G Jade Black 4GB RAM 128GB ROM : Amazon.in: Health & Personal Care"))
			{
				w1.findElement(By.cssSelector("[name='submit.add-to-cart']")).click();
			}
		}
		
		TakesScreenshot ts = (TakesScreenshot)w1;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshot6/image1.png");
		FileHandler.copy(src, dest);
		
		
		
	}

}
