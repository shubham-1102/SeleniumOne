package selenium_29_8_2023;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tbale_content {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,800)", "");
		
		List<WebElement> tabledata = new ArrayList<WebElement>();
		
//		tabledata = driver.findElements(By.xpath("//table[@id='table1']//tbody"));
//		for(WebElement i:tabledata) {
//			System.out.println(i.getText());
//		}
		
//		tabledata = driver.findElements(By.xpath("//table[@id='table1']//tr//td[3]"));
		tabledata = driver.findElements(By.xpath("//table[@id='table1']//tr//td[3]"));
		for(WebElement i:tabledata) {
			System.out.println(i.getText());
		}
		 System.out.println("----------------------------------------");
		List <WebElement> table1 = driver.findElements(By.xpath("//*[@id=\"table1\"]//td[3]"));
        for(WebElement i:table1) {
            System.out.println(i.getText());
        }

        System.out.println("----------------------------------------");
        List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"table1\"]//tbody//tr"));

        for(int i=0;i<rows.size();i++) {
            WebElement num=driver.findElement(By.xpath("//table[@id='table1']//tr["+(i+1)+"]//td[3]"));
            System.out.print(num.getText().equals("Mumbai")?"Present":"");
        }
		
		Thread.sleep(30000);
		driver.quit();
	}

}
