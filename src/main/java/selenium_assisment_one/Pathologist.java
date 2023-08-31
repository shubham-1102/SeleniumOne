package selenium_assisment_one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pathologist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.smart-hospital.in/site/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        

        driver.findElement(By.linkText("Pathologist")).click();
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        driver.findElement(By.xpath("//*[text()='Messaging']")).click();
        driver.findElement(By.partialLinkText("Post New ")).click();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("ABC");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("/html/body")).sendKeys("ABC");
        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//input[@id=\"date\"]")).sendKeys("05/03/2022");
        driver.findElement(By.xpath("//input[@id=\"publish_date\"]")).sendKeys("09/22/2022");
      
        //click on send
        driver.findElement(By.xpath("//*[text()=' Send']")).click();
        WebElement successfull_msg = driver.findElement(By.xpath("//*[text()='Record Saved Successfully']"));
        String msg = successfull_msg.getText();
        System.out.println(msg);
	}

}
