package task1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pastEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shupatil\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
	    //Browser Setup
		co.setBinary("C:\\Users\\shupatil\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.click();
		username.sendKeys("standard_user",Keys.TAB);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("secret_sauce",Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("About")));
		driver.findElement(By.linkText("About")).click();
		
		Thread.sleep(3000);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,6000)", "");
		
		driver.findElement(By.linkText("Events")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		jss.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(5000);
		List<WebElement> data=driver.findElements(By.tagName("h3"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for(WebElement i : data) {
				System.out.println(i.getText());
		}
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.quit();
	}

}
