package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oct17_Handlingdropdown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		// SelectByIndex
		
		w1.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
	   WebElement web = w1.findElement(By.xpath("//select[@id='course']"));
	   
	  Select s1 = new Select(web);
	  
	  s1.selectByIndex(2);
	  
	  
	  // SelectByValue
	  
//	  s1.selectByValue("net");
	  
//	   SelectByVisibleText
	  
//	  s1.selectByVisibleText("Javascript");
//	  
//	  Thread.sleep(2000);
//	  
//	  s1.selectByVisibleText("Java");
//	  
	  
	  
	  
	  
	  
	  
	  
	
	}

}
