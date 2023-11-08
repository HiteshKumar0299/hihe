package com.section1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Oct13_flipkart {

		public static void main(String[] args) throws InterruptedException, IOException {
			Scanner sc = new Scanner(System.in);
			
			WebDriver w1 = new ChromeDriver();
			
			w1.manage().window().maximize();
			
			w1.get("https://www.flipkart.com/");
			
			Thread.sleep(2000);
			
			w1.findElement(By.xpath("//span[contains(@class,'XB9F')]")).click();
			
			WebElement web = w1.findElement(By.xpath("//input[@type='text']"));
			
			web.sendKeys("iphone13");
			
			w1.findElement(By.xpath("//button[contains(@class,'iLD')]")).click();
			
		   String s1 =	w1.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']")).getText();
			
		   System.out.println(s1);
		   
		   String s2 = w1.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/../..//div[contains(@class,'jeq')]")).getText();
		   
			System.out.println(s2);
			
			TakesScreenshot ts = (TakesScreenshot) w1;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./Screenshot4/image.png");
			FileHandler.copy(src, dest);
		}

	}


