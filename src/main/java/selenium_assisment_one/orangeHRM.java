package selenium_assisment_one;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRM {
	
	static String s = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@name='username']"))).sendKeys("admin123",Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-userdropdown-tab")));
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		System.out.println(driver.getCurrentUrl().equals(s)?"Pass":"Fail");
	}

}
