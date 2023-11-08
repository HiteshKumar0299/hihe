package com.section1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_browser {
	
	public static void main(String[] args) {
		
		//ChromeDriver ch1 = new ChromeDriver(); 
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		 WebDriver w1 = new ChromeDriver();
		 String s1 = "https://www.fndjff.in/ref=hsi_android_chrome_114";
		
		switch (n) {
		case 1:
			
			FirefoxDriver f1 = new FirefoxDriver();
			
			break;
			
			
		case 2:
			
			ChromeDriver c1 = new ChromeDriver();
			c1.get(s1);
			break;
			
			
		case 3:
			
			EdgeDriver e1 = new EdgeDriver();

		default:
			System.out.println("Invalid Input");
			break;
		
		}
	}

}
