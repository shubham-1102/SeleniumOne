package com.seleniumproject.seleniumProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class browserbing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://smartclifflms.info/my/");
		driver.manage().window().maximize();
		
//		driver.get("https://www.google.com/");
//		driver.navigate().back();
//		//Thread.sleep(3000);
//		driver.navigate().forward();
//		//Thread.sleep(3000);
//		driver.navigate().refresh();
//		System.out.println(driver.getTitle());
//		String s = driver.getPageSource();
//		System.out.println(s.length());
//		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		Set<String> handles = driver.getWindowHandles();
		for(String s : handles) {
			System.out.println(driver.switchTo().window(s));
			System.out.println(driver.getTitle());
			System.out.println(s);
		}
		
		
		driver.quit();
		
	}

}
