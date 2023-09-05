package testng_assertion_4_9_2023;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class depends0n_classs {
	WebDriver driver;
	@Test(groups = "G1", priority = 0)
  public void f() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://google.com");
  }
	
	@Test(groups = "G2" )//,dependsOnGroups = {"f"}
	  public void f1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("q")).sendKeys("Depends",Keys.ENTER);
	  }
	
	@Test(groups = "G1" , priority = 2)//dependsOnMethods = {"f","f1"}
	  public void f2() {
	
		driver.quit();
	  }
	
}
