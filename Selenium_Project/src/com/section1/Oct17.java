package com.section1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Oct17 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	
		
		WebDriver w1 = new ChromeDriver();
		
		
		w1.get("https://demo.actitime.com/login.do");
		
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Random ram = new Random();
		int num = ram.nextInt(1000);
		
	WebElement web = w1.findElement(By.xpath("//input[@name='username']"));
	
		web.sendKeys("admin");
	
	WebElement web1 = w1.findElement(By.xpath("//input[@name='pwd']"));
	
	  web1.sendKeys("manager");
	  
	WebElement web2 = w1.findElement(By.xpath("//a[@class='initial']"));
	  
	web2.click();
	
//	Thread.sleep(1000);
	 w1.findElement(By.xpath("//div[@id='container_tasks']")).click();
//	  
//     Thread.sleep(1000);
	 w1.findElement(By.xpath("//div[@class='title ellipsis']")).click();
//	 
//	 Thread.sleep(1000);
	 w1.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
//	 
//	 Thread.sleep(1000);
	WebElement web3 =  w1.findElement(By.className("newNameField"));
	web3.sendKeys("rohit"+num);
	
//	Thread.sleep(1000);
	w1.findElement(By.xpath("//div[text()='Create Customer']")).click();
	
//	Thread.sleep(2000);
	String s1 = w1.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[@class='title']")).getText();
	 System.out.println(s1);
	 
	 TakesScreenshot ts = (TakesScreenshot)w1;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 
	 File dest = new File("./Screenshot1/image.png");
	 FileHandler.copy(src, dest);
	 
	 
	
	
	
		
		
	}
}
