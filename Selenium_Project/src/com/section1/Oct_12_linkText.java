package com.section1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oct_12_linkText {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		w1.get("https://demowebshop.tricentis.com/");
		
		w1.get("https://demowebshop.tricentis.com/login");
		
		w1.get("https://demo.actitime.com/login.do"); 
		
		// linktext function
		
//		w1.findElement(By.linkText("Books")).click();
		
//		w1.findElement(By.linkText("Electronics")).click();
		
//		w1.findElement(By.linkText("Forgot password?")).click();
		
		
		// partial linktext function
		
		w1.findElement(By.partialLinkText("Forgot")).click();
		
		
		
		
		
		
		
	}

}
