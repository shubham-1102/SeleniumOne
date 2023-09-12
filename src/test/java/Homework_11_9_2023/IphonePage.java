package Homework_11_9_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IphonePage {

	WebDriver driver;
	
	@FindBy(xpath="//span[text()=\"$123.20\"]")
	public static WebElement iPhonePrice;

	//span[text()="$123.20"]

	public IphonePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPriceFromHome() {
		String price_on_Iphone = iPhonePrice.getText();
		return price_on_Iphone;
	}
	
	
}
