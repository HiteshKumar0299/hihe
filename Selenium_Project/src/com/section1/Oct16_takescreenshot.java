package com.section1;

// ---------6---------

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Oct16_takescreenshot {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://www.flipkart.com/");
		
		
		TakesScreenshot ts = (TakesScreenshot)w1;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/flipkart.png");
		FileHandler.copy(src,dest);
		
		
		
		
		
		
		
		
		
	}
	

}
