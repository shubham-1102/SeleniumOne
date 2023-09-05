package com.seleniumproject.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest2 {
WebDriver driver;

  
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.demoblaze.com/");
	 
  }
  
  
  @BeforeClass
  public void beforeclas1() throws InterruptedException {
	  System.out.println("Before Class Mehtod 2");
  }
  
  @AfterClass
  public void afterclas1() throws InterruptedException {
	  System.out.println("After Class Mehtod 2");
  }
  
  

  @BeforeTest
  public void beforetest12() {
	  System.out.println("Before Test 2");
  }
  
  @AfterTest
  public void aftertest12() {
	  System.out.println("After Test 2");
  }
}


