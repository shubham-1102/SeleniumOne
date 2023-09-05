package com.seleniumproject.seleniumProject;
import org.testng.annotations.Test;
import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
	WebDriver driver;
	
	
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();	
	  driver.get("https://google.com");
	  
  }
    
  @BeforeTest
  public void beforetest12() {
	  System.out.println("Before Test 1");
  }
  
  @AfterTest
  public void aftertest12() {
	  System.out.println("After Test 1");
  }
  
 
  @BeforeClass
  public void bdeforeclas1() throws InterruptedException {
	  System.out.println("Before Class Mehtod 1");
  }
  
  @AfterClass
  public void afterclas1() throws InterruptedException {
	  System.out.println("After Class Mehtod 1");
  }
  
}


