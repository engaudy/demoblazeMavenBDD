package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderFormPlace {
	WebDriver driver;
	
	By lbl_name = By.id("name");
	By lbl_country = By.id("country");
	By lbl_city = By.id("city");
	By lbl_creditcard = By.id("card");
	By lbl_month = By.id("month");
	By lbl_year = By.id("year");
	By btn_purchase = By.xpath("//button[.='Purchase']");
	
	public OrderFormPlace(WebDriver driver) {
		this.driver = driver;
	}

	public void formPlace(String strName,String strCountry, String strCity, String strCard,String strMonth,String strYear) {
		
		//driver.switchTo().frame("ModelFrameTitle");
		driver.findElement(lbl_name).sendKeys(strName);
		driver.findElement(lbl_country).sendKeys(strCountry);
		driver.findElement(lbl_city).sendKeys(strCity);
		driver.findElement(lbl_creditcard).sendKeys(strCard);
		driver.findElement(lbl_month).sendKeys(strMonth);
		driver.findElement(lbl_year).sendKeys(strYear);
		driver.findElement(btn_purchase).click();
	}
}
