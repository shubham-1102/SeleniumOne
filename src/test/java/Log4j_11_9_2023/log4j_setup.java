package Log4j_11_9_2023;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class log4j_setup {
	WebDriver driver;
	Logger loger;
	
  @BeforeTest
  public void beforetest() {
	  driver = new ChromeDriver();
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7)); 
  }
  
  @Test
  public void f() {
	  loger = LogManager.getLogger(log4j_setup.class);
	  
	  
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Google");
	  ///loger.error("THis is error message");
	  
	  
  }
}
