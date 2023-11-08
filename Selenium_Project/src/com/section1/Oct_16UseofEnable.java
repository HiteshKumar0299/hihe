  package com.section1;

//---------4---------

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct_16UseofEnable {
	
	// isEnable method
	
	public static void main(String[] args) {
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://demo.actitime.com/login.do");
		 WebElement web = w1.findElement(By.name("username"));
		 
		 if(web.isEnabled())
		 {
			 web.sendKeys("admin");
		 }
		 else
		 {
			 System.out.println("Webelement is disabled");
		 }
		 
		WebElement web1 = w1.findElement(By.name("pwd"));
		 if(web1.isEnabled())
		 {
			 web1.sendKeys("manager");
		 }
		 else {
			 System.out.println("Webelement of pwd is disabled");
		 }
		 
		WebElement web2 = w1.findElement(By.id("keepLoggedInCheckBox"));
		 if(web2.isSelected()) {
			 
			 System.out.println("Cannot logged in");
		 }
		 else {
			 web2.click();
		 }
		 
		 WebElement web3 = w1.findElement(By.id("loginButton"));
		 
		 if(web3.isEnabled())
			 web3.click();
		 else
			 System.out.println("Login is disabled");
		 
		 
		 
		 // isdisplayed method
		 
		 
		WebElement logo = w1.findElement(By.className("atLogoImg"));
		if(logo.isDisplayed())
			System.out.println("logo is displayed");
		
		else
			System.out.println("logo is not displayed");
		 
		 
		 
		 
		
	}

}
