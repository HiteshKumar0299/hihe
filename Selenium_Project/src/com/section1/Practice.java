package com.section1;

import java.util.Scanner;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		WebDriver w1 = new ChromeDriver();
		
		w1.get("https://mamaearth.in/");
		
		 String actual_title = w1.getTitle();
		 System.out.println(actual_title);
		 
		 String expected_title = "Mamaearth Natural Skin & Hair Care Products - Save Upto 35%";
		
		 if(actual_title.equals(expected_title))
		 {
			System.out.println("test case is passed");
		 }
		else
			System.out.println("test case is failed");
		 
		 String actual_url = w1.getCurrentUrl();
		 
		 String expected_url = "https://mamaearth.in/";
		 
		 if(actual_url.endsWith(expected_url))
			 System.out.println("url pass");
		 
		 else
			 System.out.println("url fails");
		 
		 
//		System.out.println(w1.getPageSource());
		 
	     Options op = w1.manage();
	     
	     Window win = op.window();
	     
//	     win.fullscreen();
	     
	     
	     System.out.println(w1.manage().window().getSize());
	     
	     System.out.println(w1.manage().window().getPosition());
	     
	     Dimension d1 = new Dimension(1233, 120);
	     
	     w1.manage().window().setSize(d1);
	     
	     Point p1 = new Point(123, 345);
	     
	     w1.manage().window().setPosition(p1);
	     
	     
	     
	     
		 
		 
		 
	}

}
