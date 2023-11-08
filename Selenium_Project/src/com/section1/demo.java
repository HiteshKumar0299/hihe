package com.section1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java Work\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver w1 = new ChromeDriver();
		
        w1.get("https://www.amazon.in/ref=hsi_android_chrome_114");
        
        System.out.println(w1.getTitle());
        
        if(w1.getTitle()=="Amazon.in")
        	System.out.println("hehe");
        else
         
        	System.out.println("hihihihi");
		
	}

}
