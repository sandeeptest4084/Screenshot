package com.testpackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;


@Listeners(com.utility.ListenerClass.class)
public class TakeScreenShot extends BaseClass

{
	@Test
	 public void testCase1() 
	{
		setup();
	  driver.findElement(By.id("email")).sendKeys("sandeep.mahandarkar@yahoo.com");
	  
	  Assert.assertTrue(false);
	  
	}
	 
	@Test
	 public void testCase2() 
	{
		setup();
	  driver.findElement(By.id("pass")).sendKeys("Sandeep@4084");
	  
	  Assert.assertTrue(false);
	 }
	
	@AfterMethod
	 public void Teardown()
	 {
		 driver.close();
	 }
}
