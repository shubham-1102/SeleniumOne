package unit_tesing_5_9_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class test_parameters {
  WebDriver driver;
	@Test
  public void f() throws InterruptedException {
  Thread.sleep(3000);
  WebElement uname = driver.findElement(By.name("username"));
  WebElement upass = driver.findElement(By.name("password"));
  WebElement submit = driver.findElement(By.xpath("//button[text()=' Login ']"));
  uname.sendKeys("Admin");
  upass.sendKeys("admin123");
  
  }
	
	@Parameters("browser")
	@BeforeMethod
	public void befireMethod(String b1) {
		if(b1.equals("chrome")) {
			driver = new ChromeDriver();
			String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.get(url);
			driver.manage().window().maximize();
			
		}else {
			driver = new EdgeDriver();
			String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.get(url);
			driver.manage().window().maximize();
		}
	}
}
