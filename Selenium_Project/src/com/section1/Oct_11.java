package com.section1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct_11  {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		WebDriver w1 = new ChromeDriver();
		
		// get and close method
		
//		w1.get("https://www.amazon.in/");
		
//		w1.close();
		
//		w1.quit();
		
		
		
		// navigate method
		
		w1.manage().window().maximize();
		
		w1.navigate().to("https://www.amazon.in/");
		w1.navigate().to("https://www.selenium.dev/");   
		
		Thread.sleep(1000);
		w1.navigate().back();
		
		Thread.sleep(1000);
		w1.navigate().forward();
		
		Thread.sleep(1000);
		w1.navigate().refresh();
		
		Thread.sleep(1000);
		w1.quit();
		
		
		
		
		
		
		
		
		
	}

}
