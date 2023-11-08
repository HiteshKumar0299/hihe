package com.section1;

// ---------3---------

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oct16_getTageName {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// getTageName and isSelected
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
//		
//		w1.get("https://www.flipkart.com/");
//		
//		String s1 =	w1.findElement(By.name("q")).getTagName();
//		System.out.println(s1);
		
//		isSelected
		
		
		w1.get("https://demo.actitime.com/login.do");
		WebElement web = w1.findElement(By.xpath("//input[@type='checkbox']"));
		web.click();
		
		if(web.isSelected())
			System.out.println("Checkbox is selected");
		
		else
			System.out.println("Checkbox is not selected");
	
	
	}

}
