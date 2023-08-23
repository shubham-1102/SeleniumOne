package com.seleniumproject.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shupatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
	    //Browser Setup
		co.setBinary("C:\\Users\\shupatil\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//WebElement e = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
		//e.sendKeys("Hello" , Keys.ENTER);
		
		
		//---------xpath locators--------------------//
		
		//   //textarea[starts-with(@id,'A')]
		//   //input[@value='Login In' or @type='submit']
		
		
		//---------------	Parent class  ---------------//
		//    //textarea[starts-with(@id,'A')]//parent:div
		
		//  		//textarea[starts-with(@id,'A')]//preceding-sibling::*
		//			//textarea[starts-with(@id,'A')]//following-sibling::*
		
		//-------xpath locations ends here----------//
		
		WebElement e = driver.findElement(By.xpath("//textarea[starts-with(@id,'A')]"));
		e.sendKeys("Google One");
		Thread.sleep(30000);
		driver.quit();
	}

}
