package unit_tesing_5_9_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class group_and_dependsongroup {
  WebDriver driver;
	@Test(groups = "g1")
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://google.com");
  }
	
	@Test(groups = "g2" , dependsOnGroups = "g1")
	  public void f1() {
		 driver.findElement(By.name("q1")).sendKeys("selenium",Keys.ENTER);
	  }
	
	@Test(groups = "g3" , dependsOnGroups = {"g1","g2"})
	  public void f2() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  }
	
	@Test( dependsOnGroups = {"g1","g2","g3"})
	  public void f3() {
		driver.quit();
	  }
	
	
}
