package com.testdemo.usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		
	        WebDriver driver;
    
			
			System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			WebElement custom = driver.findElement(By.xpath("(//label[@class = '_58mt'])[3]"));
			
			custom.click();
			
			boolean a = custom.isSelected();
			System.out.println(a);
			
			
			//boolean b = custom.isEnabled();
			//System.out.println(b);
			
			//boolean c = custom.isDisplayed();
			//System.out.println(c);
			
			

	

	}

}
