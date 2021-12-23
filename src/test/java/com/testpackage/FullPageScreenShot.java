package com.testpackage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenShot {

	
	WebDriver driver;

	 @Test
	 public void setup() throws InterruptedException 
	 {
		  System.setProperty("webdriver.chrome.driver",
		    "D:\\software\\study softwares\\chromedriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/login/");
		  WebElement element = driver.findElement(By.id("email"));
	  
	  Screenshot Screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, element);
	  
	  try {
	   ImageIO.write(Screenshot.getImage(), "png",
	     new File("D:\\Testingprojects\\Screenshot\\Screen\\Ashot1.png"));
	  } catch (IOException e) {
	   e.getMessage();
	  }
	  
	  driver.close();
	 }
	}
	

