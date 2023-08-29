package second_week_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseevents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/?utm_source=bing&utm_medium=cpc&utm_platform=paidads&utm_content=&utm_campaign=Bing-Search-Brand-India&utm_campaigncode=BrowserStack-Alpha+156924&utm_term=e+browserstack&msclkid=122854510df813b7869630bd8f157297");
//		JavascriptExecutor jss = (JavascriptExecutor)driver;
//		jss.executeScript("window.scrollBy(0,100)", "");
//		Actions action = new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		WebElement ele = driver.findElement(By.xpath("//*[text()='Products']"));
//		action.moveToElement(ele).perform();
//		
		
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(4000);
		action.contextClick();
		WebElement ele = driver.findElement(By.xpath("//h1[contains(text(),'App')]"));
		action.doubleClick(ele).perform();
		
		
		Thread.sleep(30000);
		driver.close();
	}

}
