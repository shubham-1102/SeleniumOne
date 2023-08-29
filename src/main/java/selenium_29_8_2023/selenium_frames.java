package selenium_29_8_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Actions action = new Actions(driver);
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,100)", "");
		String s = driver.getWindowHandle();
		
		driver.switchTo().frame("frame1");
		WebElement ele= driver.findElement(By.id("sampleHeading"));
//		action.doubleClick(ele).perform();
		System.out.println(ele.getText());
		driver.switchTo().defaultContent();
		
		System.out.println(s.equals(driver.getWindowHandle())?"Default page":"Iframe");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).click();
		
		Thread.sleep(30000);
		driver.close();
	}

}
