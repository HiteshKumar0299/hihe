package com.section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oct17_multiselectdropdown {
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		
		w1.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		 WebElement web = w1.findElement(By.xpath("//select[@id='course']"));
		 
		 Select s = new Select(web);
		 
		 s.selectByIndex(3);
		 s.selectByIndex(1);
		 s.selectByIndex(2);
		 
//       Multi Select dropdown .................
			
	WebElement dropdown = w1.findElement(By.xpath("//select[@id='ide']"));
	
	Select s1 = new Select(dropdown);
	
	s1.selectByIndex(1);
	s1.selectByIndex(3);
	s1.selectByIndex(2);
	
	//     List<WebElement> op = s1.getOptions();
	//     
	//     for(WebElement o1: op) {
	//   	  System.out.println(o1.getText());
	//     }
	//
	//List<WebElement> op = s1.getAllSelectedOptions();
	//
	//for(WebElement opt: op) {
	//	
	//	System.out.println(opt.getText());
	//}
	
	//  getFirstselectedOption().................
	
	WebElement web1 = s1.getFirstSelectedOption();
	
	System.out.println(web1.getText());
		 
		
		 
		
		
		
	}

}
