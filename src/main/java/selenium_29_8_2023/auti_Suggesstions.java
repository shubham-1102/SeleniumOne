package selenium_29_8_2023;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auti_Suggesstions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.sort_order&order=ASC&limit=10");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Actions action = new Actions(driver);
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,100)", "");
		String s = driver.getWindowHandle();
		Select select = new Select(driver.findElement(By.xpath("//select[@id='input-sort']"))) ;
		List<WebElement> options = select.getOptions();
		List<String> elements = new ArrayList<String>();
		for(WebElement l:options) {
			elements.add(l.getText());
		}
		//select.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.price&order=ASC&limit=10");
		select.selectByVisibleText("Rating (Highest)");
		Thread.sleep(3000);
		select.deselectAll();
		Collections.sort(elements);
		
		for(String l:elements) {
			System.out.println(l);
		}
		
		
		Thread.sleep(30000);
		driver.quit();
	}

}
