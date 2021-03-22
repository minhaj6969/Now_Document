package com.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void screenS (WebDriver driver, String sc) throws Throwable{
		
		
		TakesScreenshot shots = (TakesScreenshot) driver;
		File fl = shots.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File(sc  +".png"));
		
		
		
	}

}
