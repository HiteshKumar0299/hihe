package com.section1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		WebDriver w1 = new ChromeDriver();
		
		w1.get("https://www.amazon.in/");
		
		String actual_title = w1.getTitle();
		System.out.println(actual_title);
		
		String expected_title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("Test case is passed");
		}
		
		else
			System.out.println("Test case is failed");
		
		String expected_url = "https://www.amazon.in/";
		String actual_url = w1.getCurrentUrl();
		
		if(actual_url.equals(expected_url))
			System.out.println("The url is correct");
		
		else
			System.out.println("The url is not correct");
		
	}

}
