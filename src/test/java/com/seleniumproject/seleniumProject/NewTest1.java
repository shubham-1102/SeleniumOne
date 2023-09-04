package com.seleniumproject.seleniumProject;
import org.testng.annotations.Test;
import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
  
  @Test
  public void f2() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.demoblaze.com/");
  }
  
  
  
  
}
