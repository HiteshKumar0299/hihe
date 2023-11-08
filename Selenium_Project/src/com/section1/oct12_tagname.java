package com.section1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oct12_tagname {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		WebDriver w1 = new ChromeDriver();
		
		// tagname
		
//		w1.manage().window().maximize();
//		w1.get("https://demowebshop.tricentis.com/");
//		
//		w1.findElement(By.tagName("input")).click();
		
		// CSS selector
		
		w1.manage().window().maximize();
		w1.get("https://demo.actitime.com/login.do");
		
		WebElement web =w1.findElement(By.cssSelector("[placeholder='Username']"));
		web.sendKeys("admin");
	
		
		WebElement web1 =w1.findElement(By.cssSelector("[placeholder='Password']"));
		web1.sendKeys("manager");
		
		
		WebElement web2 =w1.findElement(By.cssSelector("[class='initial']"));
		web2.click();
		
		Thread.sleep(2000);
		 w1.findElement(By.id("container_tasks")).click();
		 
		 Thread.sleep(2000);
		 w1.findElement(By.cssSelector("[class='title ellipsis']")).click();
		 
		 Thread.sleep(2000);
		 w1.findElement(By.cssSelector("[class='item createNewCustomer']")).click();
		 
		 Thread.sleep(2000);
	     w1.findElement(By.cssSelector("[class='customerInfoDiv']")).click();
	     
	     Thread.sleep(2000);
	    WebElement web3 =  w1.findElement(By.className("newNameField"));
	    web3.sendKeys("admin");
	    
	    Thread.sleep(2000);
	    
	     w1.findElement(By.cssSelector("[class='components_button withPlusIcon']")).click();
		
		  
		
	
	}

}
