package com.testdemo.usa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		
		// if the tag name is select then we use select class otherwise use regular drive.findByWebElement  
		
		//month_dd.selectByIndex(5);
		
		//Thread.sleep(2000);
		
		//month_dd.selectByValue("7");
		
		//Thread.sleep(2000);
		
		month_dd.selectByVisibleText("Oct");
		
		WebElement SL = month_dd.getFirstSelectedOption();
		System.out.println(SL);
		
		
		List<WebElement> month_list = month_dd.getOptions();
		System.out.println(month_list.size());
		
		
		for(WebElement ele : month_list){
			
			String month_name = ele.getText();
			
			System.out.println(month_name);
			
		}
		
		//for( int i = 0; i <month_list.size(); i++){
			
			
			//System.out.println(month_list.get(i).getText());
			
			
		//}
		
		
		
		
		
		
		
	}
	
	

}
