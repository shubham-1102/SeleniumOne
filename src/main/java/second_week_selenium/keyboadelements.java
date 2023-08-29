package second_week_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboadelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");

		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		action.keyDown(Keys.SHIFT).perform();
		driver.findElement(By.id("APjFqb")).sendKeys("hello");
		action.keyUp(Keys.SHIFT).perform();
		driver.findElement(By.id("APjFqb")).sendKeys(" how are you");
		
		Thread.sleep(30000);
		driver.close();
		
	}

}
