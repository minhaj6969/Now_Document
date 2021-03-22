package com.testdemo.usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	
	
	public static void main(String[] args) {
		
        WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.jcpenney.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions  ac = new Actions(driver);
		WebElement ad = driver.findElement(By.xpath("//span[contains(text(),'Shop Departments')]"));
		ac.moveToElement(ad).moveToElement(driver.findElement(By.xpath("//span[@class='_3ownk']"))).click().build().perform();
		
	}

}
