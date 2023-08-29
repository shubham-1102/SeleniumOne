package second_week_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leftrightoflocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/");
		
		WebElement imgele = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));
		String s = driver.getWindowHandle();
		driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(imgele)).click();
		driver.switchTo().defaultContent();
		driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(imgele)).click();
		driver.switchTo().defaultContent();
		driver.findElement(RelativeLocator.with(By.tagName("img")).near(imgele)).click();
		
		Thread.sleep(10000);
		driver.switchTo().window(s);
		Thread.sleep(5000);
		System.out.println("Done");
		
		
		driver.quit();
		
		
	}

}
