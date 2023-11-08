package com.section1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		w1.get("https://www.flipkart.com/");
		
	   Thread.sleep(1000);	
	   w1.findElement(By.xpath("//span[contains(@class,'XB9F')]")).click();
		
	  Thread.sleep(1000); 
	  WebElement web1 = w1.findElement(By.xpath("//input[@type='text']"));
	   web1.sendKeys("Laptop");
	   
	 
	  w1.findElement(By.xpath("//button[contains(@class,'iLD')]")).click();
	  
      String s1 = w1.findElement(By.xpath("//div[text()='GIGABYTE G5 GE-51IN213SH Core i5 12th Gen 12500H - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVID...']")).getText();
	  System.out.println(s1);
      
      
	 String s2 = w1.findElement(By.xpath("//div[text()='GIGABYTE G5 GE-51IN213SH Core i5 12th Gen 12500H - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVID...']/../..//div[contains(@class,'30jeq3')]")).getText();
     System.out.println(s2);
     
     TakesScreenshot ts = (TakesScreenshot)w1;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./Screenshot3/image.png");
	FileHandler.copy(src, dest);
	  
	   
	 
	 
	}

}
