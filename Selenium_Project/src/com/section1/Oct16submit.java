package com.section1;

// --------1-----------

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct16submit {
	
	// submit and clear method
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		w1.get("https://www.amazon.in/");
		
		WebElement web =w1.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		web.sendKeys("mobile");
		Thread.sleep(2000);
		
		web.clear();
		Thread.sleep(1000);
		
		web.sendKeys("laptop");
		web.submit();
		 
		
	}

}
