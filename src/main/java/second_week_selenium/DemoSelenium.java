package second_week_selenium;

import java.time.Duration;

import org.bouncycastle.crypto.DerivationFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement input ;
		driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("Admin");
		//driver.findElement(RelativeLocator.with(By.tagName("input")).below(input)).sendKeys("chalachala");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(login)).sendKeys("chalchalave");
		Thread.sleep(30000);
		driver.close();
	}

	

}
