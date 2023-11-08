package com.section1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct13_xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		// register in demo web shop and after that login
		
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		w1.get("https://demowebshop.tricentis.com/register");
		
	 WebElement web = w1.findElement(By.xpath("//input[@id='FirstName']"));
	 Thread.sleep(2000);
	 web.sendKeys("hitesh");
	 
	 WebElement web1 = w1.findElement(By.xpath("//input[@id='LastName']"));
	 Thread.sleep(1000);
	 web1.sendKeys("Kumar");
	 
	WebElement web2 =  w1.findElement(By.xpath("//input[@id='Email']"));
	Thread.sleep(1000);
	web2.sendKeys("hitesh2002uppal@gmail.com");
	
	WebElement web3 = w1.findElement(By.xpath("//input[@name='Password']"));
	Thread.sleep(1000);
    web3.sendKeys("BKjRJT@bfw3*A");	
    
    WebElement web4 =  w1.findElement(By.xpath("//input[@id='ConfirmPassword']"));
    Thread.sleep(1000);
    web4.sendKeys("BKjRJT@bfw3*A");
    
    w1.findElement(By.xpath("//input[@id='register-button']")).click();
    
    w1.findElement(By.xpath("//a[@href='/login']")).click();
    
    w1.findElement(By.xpath("//input[@name='Email']")).sendKeys("hitesh2002uppal@gmail.com");
    
    w1.findElement(By.xpath("//input[@id='Password']")).sendKeys("BKjRJT@bfw3*A");
    
    w1.findElement(By.xpath("//label[text()='Remember me?']")).click();
    
    w1.findElement(By.xpath("//input[@value='Log in']")).click();
	 
	 
	 
		
	}

}
