package com.section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_1 {
	
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		w1.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		w1.quit();
	}

}
