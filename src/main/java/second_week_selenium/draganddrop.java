package second_week_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");

		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,70)", "");
		
		WebElement src = driver.findElement(By.xpath("//*[text()='Drag me']"));
		WebElement des = driver.findElement(By.xpath("//*[@id='droppable']"));
//		action.clickAndHold(src).release(des).build().perform();
		action.dragAndDrop(src, des).perform();

	  //action.doubleClick(ele).perform();
		
		
		Thread.sleep(30000);
		driver.close();
	}

}
