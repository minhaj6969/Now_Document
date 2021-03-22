package com.testdemo.usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions ac = new Actions(driver);
		
		ac.sendKeys(Keys.ENTER);//To do Single
		
		ac.sendKeys(Keys.chord(Keys.SHIFT,Keys.ALT));//To Do Multiple or double
		
		WebElement drag = driver.findElement(By.xpath("//*[contains(text(),'Drag me to my target')]"));
		WebElement drop = driver.findElement(By.xpath("//*[contains(text(),'Drop here')]"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
