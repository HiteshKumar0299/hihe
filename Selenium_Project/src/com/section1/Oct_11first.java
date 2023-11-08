package com.section1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct_11first {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		
		w1.get("https://punjab.chitkara.edu.in//Interface/index.php");
		
//		WebElement searchbox = w1.findElement(By.id("twotabsearchtextbox"));
//		
//		searchbox.sendKeys("mobile");
		
//		WebElement searchbox = w1.findElement(By.name("field-keywords"));
//		searchbox.sendKeys("laptop");
		
		WebElement searchbox = w1.findElement(By.name("password"));
		searchbox.sendKeys("2010990299");
		
		
		WebElement searchbox1 = w1.findElement(By.name("bx033bf8bzfy8dfdxxyf5dy8zxf8z5z8"));
		searchbox1.sendKeys("2010990299");
		
		WebElement searchbox2 = w1.findElement(By.className("button_send"));
		searchbox2.click();
		
		
		
	}

}
