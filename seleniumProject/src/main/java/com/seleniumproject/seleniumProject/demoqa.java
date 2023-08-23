package com.seleniumproject.seleniumProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.quit();
		
		

	}

}
