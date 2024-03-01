package com.NewBuild;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.Before;

public class BaseTest {
	
	 public static WebDriver driver;
	 
	 public static void main(String[] args) {
		
	
	

		
		System.setProperty("webdriver.chrome.driver", "./chromedriver-win64/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:3000/hrDocs");
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	
	
	 }
	

}
