package selenium_assisment_one;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class naukri_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        String s = driver.getWindowHandle();
        
        JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.xpath("//*[contains(text(),'& IT')]")).click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
  
        Actions action = new Actions(driver);   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        
        WebElement element = driver.findElement(By.xpath("//*[text()='Engineering - Hardware & Networks']"));
        action.moveToElement(element).click().perform();
        Thread.sleep(3000);
        
        WebElement first = driver.findElement(By.xpath("//*[(text()='Mobile Developer (IBM Mobile First Platform)')]"));
        action.moveToElement(first).click().perform();
        tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        Thread.sleep(3000);
        
        driver.switchTo().window(s);
        
        Thread.sleep(8000);
        driver.quit();
        
        
	}

}
