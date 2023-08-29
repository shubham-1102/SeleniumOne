package selenium_29_8_2023;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebElement txtbox = driver.findElement(By.xpath("//input[@name='cusid']"));
		txtbox.sendKeys("404");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		Alert a = driver.switchTo().alert();
		
		
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(30000);
		driver.quit();
		
		
		Thread.sleep(30000);
		driver.quit();
	}

}
