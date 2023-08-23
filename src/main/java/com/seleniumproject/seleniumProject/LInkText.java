package com.seleniumproject.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LInkText {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		
		//Driver setup
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shupatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
	    //Browser Setup
		co.setBinary("C:\\Users\\shupatil\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		
		//WebElement email = driver.findElement(By.linkText("Gmail"));
		//email.click();
		//element.clear();
		
		//System.out.println(email.isEnabled());
		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		System.out.println(searchbox.getAttribute("id"));
		System.out.println(searchbox.getAttribute("maxlength"));
		System.out.println(searchbox.getSize());
		Thread.sleep(30000);
		driver.quit();
		
		
		

	}
}
