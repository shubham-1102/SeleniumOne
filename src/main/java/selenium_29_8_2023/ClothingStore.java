package selenium_29_8_2023;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClothingStore {
	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        WebDriverManager.chromedriver().setup();

	        //Creating Object of ChromeDriver
	        WebDriver driver=new ChromeDriver();

	        //opening the url
	        driver.get("https://j2store.net/free/");

	        //Maximizing the Window
	        driver.manage().window().maximize();

	        //implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
	        clothing.click();

	        List<WebElement> li=new ArrayList(driver.findElements(By.className("product-title")));
	        List<String> sortedli=new ArrayList();
	        for(WebElement s:li)
	        {
	            //System.out.println(s.getText());
	            sortedli.add(s.getText());
	        }
	        System.out.println("-------------------------------------------------------");
	        Collections.sort(sortedli);
	        for(String s1:sortedli)
	        {
	            System.out.println(s1);
	        }
	    }
}
