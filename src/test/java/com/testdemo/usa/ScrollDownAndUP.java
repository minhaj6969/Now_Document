package com.testdemo.usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownAndUP {

	public static void main(String[] args) {

		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(""));
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Actions ac = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath(""));
		ac.sendKeys(Keys.PAGE_UP).build().perform();
		
		
		
		

	}

}
