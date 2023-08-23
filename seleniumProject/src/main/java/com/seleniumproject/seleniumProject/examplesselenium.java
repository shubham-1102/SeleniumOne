package com.seleniumproject.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class examplesselenium {
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

		
		driver.findElement(By.className("gLFyf")).sendKeys("google is harmful",Keys.ENTER);
		//driver.findElement(By.className("gNO89b")).submit();		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("bing",Keys.ENTER);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.className("gLFyf"));
		element.sendKeys("firefox",Keys.ENTER);
		//element.clear();
		
		WebElement email = driver.findElement(By.linkText("Gmail"));
		email.click();
		Thread.sleep(30000);
		driver.quit();
		
		
		

	}
}
