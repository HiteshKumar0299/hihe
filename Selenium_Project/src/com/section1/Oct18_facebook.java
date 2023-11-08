package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oct18_facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		w1.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		WebElement web = w1.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(web);
		
		s1.selectByIndex(2);
		
		Thread.sleep(2000);

	    WebElement web1 = w1.findElement(By.id("month"));
		Select s2 = new Select(web1);
		s2.selectByVisibleText("Oct");
		
		Thread.sleep(2000);
		
		WebElement web2 = w1.findElement(By.id("year"));
		
		Select s3= new Select(web2);
		s3.selectByVisibleText("2002");
		
		
	
		
		
		
		
		
	}
}
