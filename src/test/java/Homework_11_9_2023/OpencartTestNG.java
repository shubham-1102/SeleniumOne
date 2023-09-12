package Homework_11_9_2023;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class OpencartTestNG {
	WebDriver driver;
	extend_report report1 = new extend_report();
	
	homepage objhomepage;
	IphonePage objIphonePage;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,12000)", "");
		report1.extend_setup();
		
	}
	
  @Test
  public void f() {	  
	  objhomepage=new homepage(driver);
	  String price1 = objhomepage.getPriceFromHome();
	  objhomepage.clickiPhonee();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  objIphonePage=new IphonePage(driver);
	  String price2 = objIphonePage.getPriceFromHome();
	  
	  try {
		  Assert.assertEquals(price1, price2);
		  System.out.println(price1);
		 report1.pass_result();
	} catch (Exception e) {
		report1.fail_result();
	}
	  
  }
  
  @AfterMethod
  public void getResult(ITestResult result) throws IOException, AWTException {
	  report1.setpasslog(result);
	}
  
  @AfterTest
  public void aftertest() {
	  report1.callFlush();
  }

	
	
	
	
}
