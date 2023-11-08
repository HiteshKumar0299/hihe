 package com.section1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oct_12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		
		w1.navigate().to("https://www.amazon.in/");
		System.out.println(w1.getTitle());
		
		WebElement we1 = w1.findElement(By.id("twotabsearchtextbox"));
		we1.sendKeys("mobile");
		
		
		WebElement we2 = w1.findElement(By.id("nav-search-submit-button"));
		we2.click();
		
		System.out.println(w1.getTitle());
		
		
//		w1.navigate().to("https://www.amazon.in/");
//		System.out.println(w1.getTitle());
//		
//		WebElement we3 = w1.findElement(By.id("twotabsearchtextbox"));
//		we3.sendKeys("dell laptop");
//		
//		
//		WebElement we4 = w1.findElement(By.id("nav-search-submit-button"));
//		we4.click();
//		
//		
//		System.out.println(w1.getTitle());
		
		
	}

}
