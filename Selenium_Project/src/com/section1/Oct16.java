package com.section1;

// --------2----------


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct16 {
	
//	Searcing the text and price of product by dynamic xpath
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		WebDriver w1 = new ChromeDriver();
		
		w1.get("https://www.amazon.in/");
		w1.manage().window().maximize();
		
	WebElement web	= w1.findElement(By.xpath("//input[contains(@placeholder,'Search Amazon.in')]"));
	web.sendKeys("camera");
	
	WebElement web1 = w1.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]"));
	 web1.click();
	 
	String s1 = w1.findElement(By.xpath("//span[text()='Fujifilm Instax Wide 300 Instant Camera- White']")).getText();
	System.out.println(s1);
	
    String s2 =	w1.findElement(By.xpath("//span[text()='Fujifilm Instax Wide 300 Instant Camera- White']/../../../..//span[@class='a-price-whole']")).getText();
	System.out.println(s2);
	
	}

}
