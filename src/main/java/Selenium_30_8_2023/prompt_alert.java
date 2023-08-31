package Selenium_30_8_2023;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prompt_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		  JavascriptExecutor jss = (JavascriptExecutor)driver;
			jss.executeScript("window.scrollBy(0,300)", "");
		WebElement txtbox = driver.findElement(By.xpath("//*[@id='promtButton']"));
		txtbox.click();
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.sendKeys("Hello Shubham");
		a1.accept();
		System.out.println(driver.findElement(By.xpath("//*[@id='promptResult']")).getText());
		
		Thread.sleep(3000);
	}

}
