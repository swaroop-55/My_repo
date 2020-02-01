package com.crm.qa.util;

import org.openqa.selenium.WebDriver;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	WebDriver driver;
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=30;
	
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

}
