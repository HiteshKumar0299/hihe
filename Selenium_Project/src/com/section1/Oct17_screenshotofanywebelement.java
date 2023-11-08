package com.section1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Oct17_screenshotofanywebelement {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver w1 = new ChromeDriver();
		w1.get("https://www.flipkart.com/");
		w1.manage().window().maximize();
		
		WebElement web = w1.findElement(By.xpath("//img[@title='Flipkart']"));
		File src = web.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshot2/image.png");
		FileHandler.copy(src, dest);
		
	}
 
}
