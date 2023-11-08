package com.section1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct12_xpath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		WebDriver w1 = new ChromeDriver();
		
		
		w1.manage().window().maximize();
		
		w1.get("https://demo.actitime.com/login.do");
		
		w1.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		w1.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		w1.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
}
