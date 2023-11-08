package in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Oct18_draganddrop {
	
	public static void main(String[] args) {
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.get("https://jqueryui.com/droppable/");
		w1.switchTo().frame(0);
		
		WebElement drag = w1.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = w1.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(w1);
		act.dragAndDrop(drag, drop).perform();
		
		
		
	}

}
