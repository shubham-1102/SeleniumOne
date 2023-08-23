package com.seleniumproject.seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipkartsinclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shupatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
	    //Browser Setup
		co.setBinary("C:\\Users\\shupatil\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		WebElement e = driver.findElement(By.xpath("//input[starts-with(@name,'q')]"));
		e.sendKeys("mobiles",Keys.ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label")).click();
		Thread.sleep(5000);
		List<WebElement> data=driver.findElements(By.className("_4rR01T"));
		for(WebElement i : data) {
			
			if (i.getText().contains("F")) {
				System.out.println(i.getText());
			}
		
		}
		Thread.sleep(60000);
		driver.quit();
		
	}

}
