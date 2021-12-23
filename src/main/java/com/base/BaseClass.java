package com.base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass 
{
	public static  WebDriver driver;

	 
	 public void setup() {
	  System.setProperty("webdriver.chrome.driver",
	    "D:\\software\\study softwares\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
	 }
	 
	 public void screenShot(String filename) 
	 {
		 String dateName = new SimpleDateFormat("yyyyMMdd").format(new Date());
		 TakesScreenshot takescreenshot= (TakesScreenshot) driver;
		   File source=takescreenshot.getScreenshotAs(OutputType.FILE);
		   
		   try {
			FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\Screen\\"+filename+"_"+dateName+".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	 }
}
