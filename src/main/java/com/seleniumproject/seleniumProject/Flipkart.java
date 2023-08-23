package com.seleniumproject.seleniumProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	static String URL = "https://www.flipkart.com/";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		int Title_Length = title.length();
		String Url_get = driver.getCurrentUrl();
		
		System.out.println("Title :"+title);
		System.out.println("Title Length :" +Title_Length);
		
		if(URL.equals(Url_get)) {
			System.out.println(Url_get);
		}
		
		String source = driver.getPageSource();
		int Length_source = source.length();
		
		System.out.println(Length_source);
		
		driver.quit();
		
		
	}

}
