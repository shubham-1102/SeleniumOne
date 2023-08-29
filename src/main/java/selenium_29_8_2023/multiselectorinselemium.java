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

public class multiselectorinselemium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		Thread.sleep(4000);
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,1200)", "");
		String s = driver.getWindowHandle();
		Select select = new Select(driver.findElement(By.name("multipleselect[]"))) ;
		List<WebElement> options = select.getOptions();
		List<String> elements = new ArrayList<String>();
		for(WebElement l:options) {
			elements.add(l.getText());
		}
//		//select.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.price&order=ASC&limit=10");
		select.selectByValue("msperformance");
		select.selectByValue("msmanual");
		select.selectByValue("msagile");
		select.deselectAll();
		
//		Thread.sleep(3000);
//		select.deselectAll();
//		Collections.sort(elements);
//		
//		for(String l:elements) {
//			System.out.println(l);
//		}
//		
		
		Thread.sleep(30000);
		driver.quit();
	}
}
