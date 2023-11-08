package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		w1.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		
		Thread.sleep(2000);
	   String s1 =w1.findElement(By.xpath("(//div[contains(@class,'rR01T')])[1]")).getText();
		
		System.out.println(s1);
		
	   String s2 =w1.findElement(By.xpath("(//div[contains(@class,'rR01T')])[1]/../..//div[contains(@class,'jeq')]")).getText();
		
		System.out.println(s2);
		
		
		
		
		
		
	   
	  
	  
		
		
	}
}
