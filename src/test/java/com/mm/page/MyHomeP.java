package com.mm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHomeP {
	
	WebDriver driver;
	
	public MyHomeP (WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath ="//input[@id = 'email']")
	
	WebElement gettbox_email;
	
	public WebElement gettbox_email(){
		return gettbox_email;
		
		
		
		
	}
    @FindBy(xpath ="//input[@id = 'pass']")
	
	WebElement gettbox_pass;
	
	public WebElement gettbox_pass(){
		return gettbox_pass;
		
		
		
		
	}
    @FindBy(xpath ="//input[@id = 'u_0_2']")
	
	WebElement gettbox_u_0_2;
	
	public WebElement gettbox_u_0_2(){
		return gettbox_u_0_2;
		
	}
	
    
	
	
	
	
	
	

}
