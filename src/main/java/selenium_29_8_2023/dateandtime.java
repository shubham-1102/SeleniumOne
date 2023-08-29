package selenium_29_8_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dateandtime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		WebElement source = driver.findElement(By.xpath("//input[@id='source']"));//sendKeys("Mumbai");
		source.sendKeys("Mumbai");Thread.sleep(1000);
		source.click();
		
		WebElement desti = driver.findElement(By.xpath("//input[@id='destination']"));//.sendKeys("Chennai");
		desti.sendKeys("Chennai");Thread.sleep(1000);
		desti.click();
		WebElement datepick = driver.findElement(By.xpath("//input[@id='datepicker1']"));
		datepick.click();
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("arguments[0].value=('04-08-2023')", datepick);

		Thread.sleep(1000);
		driver.findElement(By.linkText("Search")).click();
		
		
		
		Thread.sleep(30000);
		driver.quit();
	}

}
