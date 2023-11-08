package com.section1;


import java.lang.StackWalker.Option;
import java.util.Scanner;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 WebDriver w1 = new ChromeDriver();
		 
		 System.out.println(w1.getPageSource());
		 
		 
//		Options op  = w1.manage();
//		Window win = op.window();
        
//		win.maximize();
		
//		String s1 = "https://www.amazon.in/";
//		w1.get(s1);
		
		 
//		w1.manage().window().maximize();
		 
		 // FOR CODE OPTIMIZATION WE USE 
		
		System.out.println(w1.manage().window().getSize());
		
		System.out.println(w1.manage().window().getPosition());
		
		Dimension d1 = new Dimension(700, 350);
		
		w1.manage().window().setSize(d1);
		
		
		Point p1 = new Point(400,00);
		
		w1.manage().window().setPosition(p1);
		
		
		w1.get("https://www.amazon.in/");
		
		
	}

}
