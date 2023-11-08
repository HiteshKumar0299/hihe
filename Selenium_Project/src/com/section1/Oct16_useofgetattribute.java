package com.section1;

// -----------5--------

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct16_useofgetattribute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// getAttribute() method
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		w1.get("https://demo.actitime.com/login.do");
		
		
	  String s1 =w1.findElement(By.name("username")).getAttribute("placeholder");
	  System.out.println(s1);
	}

}
