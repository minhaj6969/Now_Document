package com.stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.Base;
import com.common.ScreenShot;
import com.mm.page.MyHomeP;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstep extends Base {
	
	MyHomeP hpm;
	
	
	
	@Given("^User able to go home page$")
	public void user_able_to_go_home_page() throws Throwable {
		
		driver = getdriver();
		
		
		
	    
	    
	}

	@When("^enter email$")
	public void enter_email() throws Throwable {
		
		hpm = new MyHomeP(driver);
		hpm.gettbox_email().sendKeys("amydjhaj@gmail.com");
		
		//driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("amydjhaj@gmail.com");
		
		ScreenShot.screenS(driver, "Books");
	    
	    
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
		
		hpm.gettbox_pass().sendKeys("12345");
		
		//driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("123456");
		
		ScreenShot.screenS(driver, "Books");
	    
	}

	@When("^Click sing in$")
	public void click_sing_in() throws Throwable {
		
		hpm.gettbox_u_0_2().click();
		
		
		//driver.findElement(By.xpath("//input[@id = 'u_0_2']")).click();
	    
		ScreenShot.screenS(driver, "Books"); 
	}

	@Then("^Log in should be successfull$")
	public void log_in_should_be_successfull() throws Throwable {
		
		
		Assert.assertEquals(driver.getTitle(), "");
		System.out.println(driver.getTitle());
		
		
	    
	    
	}


}
