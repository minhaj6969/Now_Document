package com.testdemo.usa;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		    WebDriver driver;
			
			System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			driver.findElement(By.linkText("Gmail")).click();
			driver.findElement(By.linkText("Create an account")).click();
			
			Set<String> ids = driver.getWindowHandles();
			Iterator <String> it = ids.iterator();
			System.out.println(ids.size());
			String parentid = it.next();
			String childid = it.next();
			
			System.out.println(driver.getCurrentUrl());
			driver.switchTo().window(childid);System.out.println(driver.getTitle());
			driver.switchTo().window(parentid);System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.quit();
			
			
			
			

	}

}
