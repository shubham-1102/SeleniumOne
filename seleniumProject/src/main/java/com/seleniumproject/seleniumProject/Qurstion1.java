package com.seleniumproject.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Qurstion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shupatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
	    //Browser Setup
		co.setBinary("C:\\Users\\shupatil\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		WebElement e = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
		System.out.println(e.isEnabled()?"Enables":"Not Enabled");
		System.out.println(e.isSelected()?"Selected":"Not Selected");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]")).click();
		
		System.out.println((driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]")).isSelected())?"Selected":"Not Selected");
		System.out.println((driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]")).isSelected())?"Selected":"Not Selected");
		
	}

}
