package com.testdemo.usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement check = driver.findElement(By.xpath(""));
		check.click();
		boolean a = check.isSelected();
		

	}

}
