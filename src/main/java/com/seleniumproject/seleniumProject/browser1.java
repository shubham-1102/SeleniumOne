package com.seleniumproject.seleniumProject;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		
		//Driver setup
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shupatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
	    //Browser Setup
		co.setBinary("C:\\Users\\shupatil\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		//driver.navigate().to("https://www.google.com");
		
		 StopWatch pageLoad = new StopWatch();
		 pageLoad.start();
		 driver.get("https://www.google.com");

//		driver.findElement(By.name("q")).sendKeys("google");
		 driver.findElement(By.className("gLFyf")).sendKeys("google is harmful",Keys.ENTER);
		
		 pageLoad.stop();
		//driver.findElement(By.className("gNO89b")).submit();		
		long pageLoadTime_ms = pageLoad.getTime();
        long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
        System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
        System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
		
		//driver.findElement(By.name("q")).clear();
		//driver.quit();
	}

}
