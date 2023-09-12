package Homework_11_9_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()=\"$123.20\"]")
	public static WebElement iPhonePrice1;
	
	@FindBy(xpath = "//img[@title=\"iPhone\"]")
	public WebElement iPhonee;
	
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPriceFromHome() {
		String price_on_home = iPhonePrice1.getText();
		return price_on_home ;
	}

	public void clickiPhonee() {
		this.iPhonee.click();
	}


}
