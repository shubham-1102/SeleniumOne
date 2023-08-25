package com.seleniumproject.seleniumProject;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		// driver.findElement(By.className("gLFyf")).sendKeys("google is harmful",Keys.ENTER);
		WebElement ele= driver.findElement(By.className("gLFyf"));
		
		WebDriverWait web = new WebDriverWait(driver, Duration.ofSeconds(20));
		//Thread.sleep(2000);
		//WebElement timer= 
		//web.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));//
		ele.sendKeys("google is harmful");
		 pageLoad.stop();
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement el2 =  fluentWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://www.google.com");
				return driver.findElement(By.className("gLFyf"));
			}
		});
		
		
		long pageLoadTime_ms = pageLoad.getTime();
        long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
        System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
        System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
	}

}
